
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

    //SIRVE PARA LA INTERFAZ
    public void registrarCliente(clsCliente c) {

        clsNodoCliente newNode = new clsNodoCliente(c);
        // newNode.setDato(c);

        if (this.esVacia()) {
            this.cima = newNode;
        } else {
            newNode.setNext(this.cima);
            this.cima = newNode;
        }
        this.largo++;
        /* try {
            JOptionPane.showMessageDialog(null, "¡Datos agregados correctamente!",
                    "Datos agregados", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex01) {
            JOptionPane.showMessageDialog(null, "¡Error al guardar, revise!", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }*/

    }

    /*public void AvanzarLista(String id) {
        clsNodoCliente aux = this.cima;
        clsNodoAlquiler auxA = cabeza;
        clsAtributosAlquiler alquiler = new clsAtributosAlquiler();
       // int cedula = Integer.parseInt(aux.getDato().getCedula());
        //String id;
         
          

        
        id = alquiler.getId();
            while (auxA.getNext() != null && auxA.getDato().getId() != id) {
            System.out.println("Hola1");

            auxA = auxA.getNext();
            System.out.println("aaaaa");
        }

 while (clsNodoAlquiler.next != null && clsNodoAlquiler.dato.getId() != id) {
            System.out.println("Hola1");

            auxA = auxA.getNext();
            System.out.println("aaaaa");
        }

        while (aux.getDato().getCedula() != id) {
            System.out.println("Hola2C");
            aux = aux.getNext();

        }

        if (auxA.getDato().getCantDias() == Integer.parseInt(aux.getDato().getCedula())) {
            System.out.println("Hola3");
            if (auxA.getDato().getCantDias() >= 30) {
                System.out.println("Hola4");
                //varios ifs para categoria
                aux.getDato().setCategoria("ORO");
            }
        }

    }*/
    //SIRVE PARA LA INTERFAZ
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

//REVISAR
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

    //SIRVE PARA LA INTERFAZ
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

//SIRVE PARA EL POP MODIFICADO(ELIMINAR CLIENTE OSEA SEARCH)
    public void pop() {
        if (!esVacia()) {
            // Asigna como primer node al siguiente de la pila.
            this.cima = this.cima.getNext();
            // Decrementa el contador del tamaño de la pila
            this.largo--;
        }
    }

    //SIRVE PARA LA INTERFAZ
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
        //} /*else {
            //JOptionPane.showMessageDialog(null, "El Cliente tiene un Alquiler Registrado");
        //}*/

        // Retorna el value de la bandera.
        return exist;
    }

    /*  public void removerUltimo() {
        if (this.esVacia()) {
            JOptionPane.showMessageDialog(null, "La lista está vacia");
        } else {
             clsNodoCliente aux = this.cima;
            //si hay un solo nodo
            if (this.cima.getNext()== null) {
                cima = null;
            } else {
                this.ultimo.getAnterior().setSiguiente(null);
            }
            this.ultimo = ultimo.getAnterior();
             this.largo--;
        }
    }*/
    //No sirve
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

    //No sirve
    public boolean modificarCliente(clsCliente c) {
        // Crea una copia de la pila.
        clsNodoCliente aux = cima;

        // Bandera para verificar si exist el elemento a search.
        boolean exist = false;
        // Recorre la pila hasta llegar encontrar el node o llegar al final
        // de la pila.
        while (exist != true && aux != null) {
            // Compara si el value del node es igual que al de reference.
            if (aux.getDato().getCedula() == c.getCedula()) {
                aux.getDato().setNombre(c.getNombre());
                aux.getDato().setNacimiento(c.getNacimiento());
                aux.getDato().setCorreo(c.getCorreo());
                aux.getDato().setCategoria(c.getCategoria());
                exist = true;
            } else {
                // Avanza al siguiente node.
                aux = aux.getNext();
            }
        }
        // Retorna el value de la bandera.
        return exist;
    }

    /* public boolean esPosicionValida(int indice) {
        return (indice > 0 && indice <= this.largo) || (indice > 0 && indice == this.largo + 1);
    }*/

 /* public boolean removerEnPosicion(int posicion) {
        boolean bandera = false;
        if (!this.esPosicionValida(posicion)) {
            bandera = false;
        } else {
            bandera = true;
            clsNodoCliente aux = this.cima;
            if (posicion == 1) {
                this.pop();
            } else if (posicion == this.largo) {
                this.eliminarCliente(posiscion);
            } else {
                for (int i = 1; i < posicion && aux.getNext() != null; i++) {
                    aux = aux.getNext();
                }
                //actual.getAnterior().setSiguiente(actual.getSiguiente());
                aux.getNext().setNext(aux.getNext());
                this.largo--;
            }
        }
        return bandera;
    }*/

 /* public void removerPrimero() {
        if (this.esVacia()) {
            JOptionPane.showMessageDialog(null, "La lista está vacia");
        } else {
            //si hay un solo nodo
            if (this.cima.getNext() == null) {
            } else {
                cima.getNext().setAnterior(null);
            }
            this.primero = primero.getSiguiente();
            this.cantNodos--;
        }
    }*/
    //SIRVE PARA CONSULTAR Y MOSTRAR LOS DATOS
//SIRVE PARA LA INTERFAZ NO SE PARA QUE
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

    //SIRVE PERO SOLO MUESTRA LA CEDULA
    public void Consulta(String cedula) {
        if (cima != null) {

            clsCliente c = new clsCliente();
            //   clsNodoCliente aux = cima;

            clsNodoCliente aux = new clsNodoCliente(c);

            // clsNodoCliente aux = new clsNodoCliente();
            //  aux.setDato(c);
            // Recorre la pila hasta llegar encontrar el node o llegar al final
            // de la pila.
            while (aux != null && cedula == aux.getDato().getCedula()) {
                aux = aux.getNext();
            }

            System.out.println(aux);

        }

    }

    //SIRVE
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


    /*//NO SIRVE 
    public void listar() {
        // Crea una copia de la pila.
        clsNodoCliente aux = cima;
        // Recorre la pila hasta el ultimo node.
        while (aux != null) {
            System.out.println("|\t" + aux.getDato().getCedula() + " " + aux.getDato().getNombre()
                    + aux.getDato().getNacimiento() + " " + aux.getDato().getCorreo() + aux.getDato().getCategoria() + "\t|");
            System.out.println("-----------------");
            aux = aux.getNext();
        }
    }
     

       @Override
    public String toString() {
        clsNodoCliente aux = cima;
        String s = "Lista: ";
        if (aux != null) {
            s += aux + ", ";
           aux = aux.getNext();
            while (aux != cima) {
                s += aux + ", ";
               aux = aux.getNext();
            }
        } else {
            s += "vacia";
        }
        return s;
    }
     
     */
}
