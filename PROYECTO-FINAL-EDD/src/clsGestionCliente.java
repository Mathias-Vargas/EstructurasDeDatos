
import javax.swing.JOptionPane;

/**
 *
 * @author Jeffrey Mojica S
 */
public class clsGestionCliente {

    clsAtributosAlquiler alquiler = new clsAtributosAlquiler();
    private clsNodoAlquiler cabeza;
    private clsNodoCliente cima;
    private int largo;

    public clsGestionCliente() {

        this.cima = null;
        this.largo = 0;
    }

    public boolean esVacia() {
        return cima == null;
    }

    public int tamanio() {
        return this.largo;
    }

    public void registrarCliente(clsCliente c) {

        clsNodoCliente newNode = new clsNodoCliente(c);

        if (this.esVacia()) {
            this.cima = newNode;
        } else {
            newNode.setNext(this.cima);
            this.cima = newNode;
        }
        this.largo++;
    }

    public String buscarCliente(String cedula) {
        clsNodoCliente aux = this.cima;
        String cedulaCliente = " ", nombre = " ", nacimiento = " ", correo = " ", categorias = " ";
        int contador = 1;
        if (esVacia()) {

        } else {
            do {
                if (aux.getDato().getCedula().equalsIgnoreCase(cedula)) {
                    correo = aux.getDato().getCorreo();
                    cedulaCliente = aux.getDato().getCedula();
                    nombre = aux.getDato().getNombre();
                    nacimiento = aux.getDato().getNacimiento();
                    categorias = aux.getDato().getCategoria();
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "El cliente con esos datos no existe");
                }
                aux = aux.getNext();
                contador++;
            } while (aux != cima);
        }
        return cedulaCliente + "," + nombre + "," + nacimiento + "," + correo + "," + categorias;
    }

    public void InfoAlquileres(String cedula) {
        clsNodoCliente aux = this.cima;
        clsNodoAlquiler aux2 = cabeza;
        int placa = 0, dias = 0;
        int contador = 1;
        if (esVacia()) {
            JOptionPane.showMessageDialog(null, "Esta vacia");
        } else {
            do {
                if (aux.getDato().getCedula().equalsIgnoreCase(cedula)) {

                    placa = clsNodoAlquiler.dato.getPlaca();
                    dias = clsNodoAlquiler.dato.getCantDias();
                    JOptionPane.showMessageDialog(null, "Placa: " + placa);
                    JOptionPane.showMessageDialog(null, "Dias: " + dias);
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "El cliente con esos datos no existe");
                }
                aux = aux.getNext();
                contador++;
            } while (aux != cima);
        }
    }

    public boolean editarCliente(String cedula, String nombre, String nacimiento, String correo, String categorias) {
        clsNodoCliente aux = this.cima;
        int contador = 1;
        boolean respuesta = false;
        if (esVacia()) {
            JOptionPane.showMessageDialog(null, "El Cliente con esos datos no existe");
        } else {
            do {
                if (aux.getDato().getCedula().equalsIgnoreCase(cedula)) {
                    if (!aux.getDato().getNombre().equalsIgnoreCase(nombre)) {
                        aux.getDato().setNombre(nombre);
                    } else if (!aux.getDato().getNacimiento().equalsIgnoreCase(nacimiento)) {
                        aux.getDato().setNacimiento(nacimiento);
                    } else if (!aux.getDato().getCorreo().equalsIgnoreCase(correo)) {
                        aux.getDato().setCorreo(correo);
                    } else if (!aux.getDato().getCategoria().equalsIgnoreCase(categorias)) {
                        aux.getDato().setCategoria(categorias);
                    }
                    respuesta = true;
                }
                aux = aux.getNext();
                contador++;
            } while (aux != null);
        }
        return respuesta;
    }

    public void pop() {
        if (!esVacia()) {
            // Asigna como primer node al siguiente de la pila.
            this.cima = this.cima.getNext();
            // Decrementa el contador del tamaño de la pila
            this.largo--;
        }
    }

    public boolean search(String cedula) {
        // Crea una copia de la pila.
        clsNodoCliente aux = cima;
        // Bandera para verificar si exist el elemento a search.
        boolean exist = false;

        //if (!clsNodoAlquiler.dato.getId().equalsIgnoreCase(cedula)) {
        // Recorre la pila hasta llegar encontrar el node o llegar al final
        // de la pila.
        while (exist != true && aux != null) {
            // Compara si el value del node es igual que al de reference.
            if (cedula == aux.getDato().getCedula()) {
                // Cambia el value de la bandera.
                exist = true;
                if (exist = true) {
                    clsNodoCliente cimapPilaAux = null;
                    // Recoore la pila hasta llegar al node que tenga el value
                    // igual que el de reference.
                    //  clsNodoCliente aux = cima;
                    while (cedula != cima.getDato().getCedula()) {
                        // Crea un node temporal para agregarlos a la pila auxiliar.
                        clsNodoCliente temp = new clsNodoCliente();
                        // Ingresa el value al node temporal.

                        //---temp.setValor(cima.getValor());
                        //--- temp.setDato(cima.getDato().getCedula());
                        temp.setDato(cima.getDato());

                        // Consulta si la pila auxiliar no a sido inicializada.
                        if (cimapPilaAux == null) {
                            // Inicializa la pila auxiliar.
                            cimapPilaAux = temp;
                        } // Caso contrario si la pila auxiliar ya contiene elementos
                        // los agrega al start.
                        else {
                            temp.setNext(cimapPilaAux);
                            cimapPilaAux = temp;
                        }
                        // Elimina el node del tope de la pila hasta llegar al node
                        // que se desea eliminar.
                        pop();
                        this.largo--;
                    }
                    // Elimina el node que coincide con el de reference.
                    pop();
                    this.largo--;
                    // Regresa los valuees de la pila auxiliar a la pila original
                    // mientras la pila auxiliar tenga elementos.
                    while (cimapPilaAux != null) {
                        // Utiliza el metodo push para regresar los elementos a 
                        // la pila original.

                        registrarCliente(cimapPilaAux.getDato());
                        //--- push(cimapPilaAux.setDato());

                        // Avanza al siguiente node de la pila auxiliar.
                        cimapPilaAux = cimapPilaAux.getNext();
                    }
                    // Libera la memoria utilizada por la pila auxiliar.
                    cimapPilaAux = null;
                } else {
                    System.out.println("El nodo indicado no existe");
                }
            } else {
                // Avanza al siguiente node.
                aux = aux.getNext();
            }
        }

        // Retorna el value de la bandera.
        return exist;
    }

    public void eliminarCliente(String cedula) {
        // Consulta si el value exist en la pila.
        if (search2(cedula)) {
            // Crea una pila auxiliar para guardar los valuees que se 
            // vayan desapilando de la pila original.
            clsNodoCliente cimapPilaAux = null;
            // Recoore la pila hasta llegar al node que tenga el value
            // igual que el de reference.
            //  clsNodoCliente aux = cima;
            while (cedula != cima.getDato().getCedula()) {
                // Crea un node temporal para agregarlos a la pila auxiliar.
                clsNodoCliente temp = new clsNodoCliente();
                // Ingresa el value al node temporal.

                //---temp.setValor(cima.getValor());
                //--- temp.setDato(cima.getDato().getCedula());
                temp.setDato(cima.getDato());

                // Consulta si la pila auxiliar no a sido inicializada.
                if (cimapPilaAux == null) {
                    // Inicializa la pila auxiliar.
                    cimapPilaAux = temp;
                } // Caso contrario si la pila auxiliar ya contiene elementos
                // los agrega al start.
                else {
                    temp.setNext(cimapPilaAux);
                    cimapPilaAux = temp;
                }
                // Elimina el node del tope de la pila hasta llegar al node
                // que se desea eliminar.
                pop();
                this.largo--;
            }
            // Elimina el node que coincide con el de reference.
            pop();
            this.largo--;
            // Regresa los valuees de la pila auxiliar a la pila original
            // mientras la pila auxiliar tenga elementos.
            while (cimapPilaAux != null) {
                // Utiliza el metodo push para regresar los elementos a 
                // la pila original.

                registrarCliente(cimapPilaAux.getDato());
                //--- push(cimapPilaAux.setDato());

                // Avanza al siguiente node de la pila auxiliar.
                cimapPilaAux = cimapPilaAux.getNext();
            }
            // Libera la memoria utilizada por la pila auxiliar.
            cimapPilaAux = null;
        } else {
            System.out.println("El nodo indicado no existe");
        }
    }

    public boolean search2(String reference) {
        // Crea una copia de la pila.
        clsNodoCliente aux = cima;
        // Bandera para verificar si exist el elemento a search.
        boolean exist = false;
        // Recorre la pila hasta llegar encontrar el node o llegar al final
        // de la pila.
        while (exist != true && aux != null) {
            // Compara si el value del node es igual que al de reference.
            if (reference == aux.getDato().getCedula()) {
                // Cambia el value de la bandera.
                exist = true;
            } else {
                // Avanza al siguiente node.
                aux = aux.getNext();
            }
        }
        // Retorna el value de la bandera.
        return exist;
    }

    public String ConsultarCliente(String cedula) {

        // Crea una copia de la pila.
        clsNodoCliente aux = this.cima;
        clsCliente cliente = new clsCliente();
        String nombre = " ", nacimiento = " ", correo = " ", categorias = " ";
        int contador = 1;
        // Bandera para verificar si exist el elemento a search.
        boolean exist = false;
        // Recorre la pila hasta llegar encontrar el node o llegar al final
        // de la pila.
        while (exist != true && aux != null) {
            // Compara si el value del node es igual que al de reference.
            if (cedula == aux.getDato().getCedula()) {
                // Cambia el value de la bandera.

                cedula = aux.getDato().getCedula();
                nombre = aux.getDato().getNombre();
                nacimiento = aux.getDato().getNacimiento();
                correo = aux.getDato().getCorreo();
                categorias = aux.getDato().getCategoria();

                exist = true;
                break;
            } else {
                // Avanza al siguiente node.
                JOptionPane.showMessageDialog(null, "El cliente con esos datos no existe");
                aux = aux.getNext();
                contador++;
            }
        }
        System.out.println(cedula + "," + nombre + "," + nacimiento + "," + correo + "," + categorias);
        // Retorna el value de la bandera.
        return cedula + "," + nombre + "," + nacimiento + "," + correo + "," + categorias;
    }

    public void desplegarlista() {
        // Crea una copia de la pila.
        clsNodoCliente aux = new clsNodoCliente();
        aux = cima;
        if (aux != null) {
            while (aux != null) {
                System.out.println("|\t" + aux.getDato().getCedula() + " " + aux.getDato().getNombre() + " "
                        + aux.getDato().getNacimiento() + " " + aux.getDato().getCorreo() + " " + aux.getDato().getCategoria() + "\t|");
                System.out.println("----------------------------------------");
                aux = aux.getNext();
            }
        } else {     // Recorre la pila hasta el ultimo node.
            System.out.println("Esta vacia");
        }

    }

}
