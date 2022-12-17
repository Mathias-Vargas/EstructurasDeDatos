
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Jeffrey Mojica S
 */
public class clsGestionAlquiler {

    clsCliente cliente = new clsCliente();

    public void obtener() {

        cliente.getCedula();
    }

    clsNodoCliente nc = new clsNodoCliente();
    private clsNodoAlquiler cabeza;
    private clsNodoAlquiler ultimo;
    private clsNodoCliente cabezaC;
    private clsNodoVehiculos cabezaV;
    private double monto = 0;

    public void solicitudAlquiler(clsAtributosAlquiler v) {
        if (cabeza == null) {
            cabeza = new clsNodoAlquiler(v);
            cabeza.getDato().setEstado("Registrada");
            ultimo = cabeza;
        } else {
            clsNodoAlquiler aux = new clsNodoAlquiler(v);
            aux.setNext(cabeza);
            cabeza = aux;
            cabeza.getDato().setEstado("Registrada");
        }
        ultimo.setNext(cabeza);
        v.setEstado("Registrada");
    }

    public void registrar(clsAtributosAlquiler v) {

        clsNodoAlquiler newnode = new clsNodoAlquiler(v);

        if (esVacia()) {
            cabeza = newnode;
            cabeza.getDato().setEstado("Registrada");
            ultimo = cabeza;
        } else {
            newnode.setNext(cabeza);
            cabeza = newnode;
            cabeza.getDato().setEstado("Registrada");
            ultimo.setNext(cabeza);
        }

    }

    public String consultar(String numeroPlaca) {
        clsNodoAlquiler aux = this.cabeza;
        String id = " ", marca = " ";
        String extras = " ", estado = " ";
        String placa = " ", cantDias = " ", pasajeros = " ";
        int contador = 1;
        if (esVacia()) {
            JOptionPane.showMessageDialog(null, "Esta vacia");
        } else {
            do {
                if (Integer.toString(aux.getDato().getPlaca()).equalsIgnoreCase(placa)) {
                    estado = aux.getDato().getEstado();
                    placa = Integer.toString(aux.getDato().getPlaca());
                    id = aux.getDato().getId();
                    extras = aux.getDato().getExtras();
                    marca = aux.getDato().getMarca();
                    cantDias = Integer.toString(aux.getDato().getCantDias());
                    pasajeros = Integer.toString(aux.getDato().getPasajeros());

                    break;
                } else {
                    JOptionPane.showMessageDialog(null, id + "," + placa + "," 
                            + cantDias + "," + pasajeros + "," + marca + "," 
                            + extras + "," + estado);
                }
                aux = aux.getNext();
                contador++;
            } while (aux != cabeza);
        }
        System.out.println(id + "," + placa + "," + cantDias + "," + pasajeros 
                + "," + marca + "," + extras + "," + estado);
        return id + "," + placa + "," + cantDias + "," + pasajeros + "," 
                + marca + "," + extras + "," + estado;

    }
    //valida la cantidad de dias, dependiendo de su categoria lo va a subir. 
    public void cantidadDiasS(String id) {

        clsNodoCliente aux = cabezaC;
        clsNodoAlquiler aux2 = cabeza;

        System.out.println("AAA");

        System.out.println("BBB");
        // if (aux2.getDato().getId().equalsIgnoreCase(id)) {
        System.out.println("Tercero");
        if (aux2.getDato().getCantDias() >= 30) {
            System.out.println("CCC");
            if (clsNodoCliente.dato.getCategoria().equalsIgnoreCase("Bronce") 
                    || clsNodoCliente.dato.getCategoria().equalsIgnoreCase("bronce")) {
                clsNodoCliente.dato.setCategoria("Plata");
            } else if (clsNodoCliente.dato.getCategoria().equalsIgnoreCase("Plata") 
                    || clsNodoCliente.dato.getCategoria().equalsIgnoreCase("plata")) {
                clsNodoCliente.dato.setCategoria("Oro");
            } else {
                clsNodoCliente.dato.setCategoria("Zafiro");
            }

        }

    }
    // para asignar los vehiculos se itera sobre las dos estructuras usadas para 
    //usuarios y vehiculos, una vez se encuentra la que se desea, para la iteracion
    //Si el estado de la lista es registrada entra al if y realiza mas validaciones. 
    public void asignaVehiculos(clsAtributosAlquiler v) {
        clsNodoAlquiler aux2 = cabeza;
        clsNodoVehiculos vehiculo = cabezaV;
        String estado;
        estado = "Registrada";

        while (aux2.getNext() != null && aux2.getDato().getEstado() != estado) {
            aux2 = aux2.getNext();
        }
        while (clsNodoVehiculos.next != null && 
                Integer.parseInt(clsNodoVehiculos.dato.getCapacidadPasajeros()) 
                != aux2.getDato().getPasajeros()) {
            vehiculo = vehiculo.getNext();
        }

        if (aux2.getDato().getEstado() == "Registrada") {
            if (aux2.getDato().getPasajeros() == Integer.parseInt(clsNodoVehiculos.dato.getCapacidadPasajeros())) {
                aux2.getDato().setPlaca(Integer.parseInt(clsNodoVehiculos.dato.getNumeroPlaca()));
                clsNodoVehiculos.dato.setEstado("Alquilado");
                aux2.getDato().setEstado("Procesada");
                monto = Integer.parseInt(clsNodoVehiculos.dato.getPrecioAlq()) 
                        * aux2.getDato().getCantDias() * 0.13;
                JOptionPane.showMessageDialog(null, "El monto a pagar sera: " + monto);
            } else {
                JOptionPane.showMessageDialog(null, "No hay vehiculos disponibles con esas caracteristicas");
                aux2.getDato().setEstado("Rechazada");
            }
        }

    }
    //se itera sobre la lista de alquiler hasta encontrar registrado uno bajo ese
    //id una vez se encuentra se compara con el monto
    public void montoSuperior(String id) {
        clsNodoCliente aux = cabezaC;
        clsNodoAlquiler aux2 = cabeza;

        while (aux2.getNext() != null && aux2.getDato().getId() != id) {
            aux2 = aux2.getNext();
        }

        if (clsNodoCliente.dato.getCedula().equalsIgnoreCase(id)) {
            if (monto >= 70000) {
                // aux.getDato().setCategoria("ZAFIRO");
                clsNodoCliente.dato.setCategoria("ZAFIRO");
            }
        }

    }

    //metodo consultar es un editar solicitud
    public void consultaAlquilerPlaca(int numeroPlaca) {
        if (cabeza != null) {
            clsNodoAlquiler aux = cabeza;
            while (aux != null && aux.getDato().getPlaca() != numeroPlaca) {
                aux = aux.getNext();
            }
            JOptionPane.showMessageDialog(null, aux);
            System.out.println(aux);
        }

    }
    // consulta vehiculos por id
    public void consultaVehiculosID(String id) {
        if (cabeza != null) {
            clsNodoAlquiler aux = cabeza;
            while (aux != null && aux.getDato().getId() != id) {
                aux = aux.getNext();
            }
            JOptionPane.showMessageDialog(null, aux);
            System.out.println(aux);
        }

    }
    //metodo para devolver in vehiculo, este itera sobre las dos estructuras
    //declaradas anteriormente, toma parametros de referencia y compara. 
    public void devolucionVehiculo(String id, int placa) {
        System.out.println("Cero");
        clsNodoAlquiler aux2 = cabeza;
        clsNodoVehiculos vehiculo = cabezaV;

        while (clsNodoAlquiler.next != null && clsNodoAlquiler.dato.getId() 
                != id && clsNodoAlquiler.dato.getPlaca() != placa) {
            System.out.println("Primero");
            aux2 = aux2.getNext();
        }

        while (clsNodoVehiculos.next != null 
                && Integer.parseInt(clsNodoVehiculos.dato.getNumeroPlaca()) != placa) {
            System.out.println("Segundo");
            vehiculo = vehiculo.getNext();
        }

        if (aux2.getDato().getId() == id && aux2.getDato().getPlaca() == placa) {
            System.out.println("AQUI");
            aux2.getDato().setEstado("Finalizada");
            clsNodoVehiculos.dato.setEstado("Disponible");
            // vehiculo.getDato().setEstado("Disponible");
        }

    }
    //Metodo para imprimir, recorre toda la lista. 
    public void desplegarlista() {
        // Crea una copia de la pila.
        clsNodoAlquiler aux = new clsNodoAlquiler();
        aux = cabeza;
        if (cabeza != null) {
            while (aux != null) {
                System.out.println("hola1");
                System.out.println("|\t" + aux.getDato().getId() + " " 
                        + aux.getDato().getPlaca() + " "
                        + aux.getDato().getCantDias() + " " 
                        + aux.getDato().getPasajeros() + " " 
                        + aux.getDato().getMarca()
                        + " " + aux.getDato().getExtras() + " " 
                        + aux.getDato().getEstado() + "\t|");
                System.out.println("----------------------------------------");
                aux = aux.getNext();
            }

        } else {     // Recorre la lista hasta el ultimo node.
            System.out.println("Esta vacia");
        }

    }
    //metodo para comprobar si es vacia 
    public boolean esVacia() {
        return (this.cabeza == null);
    }
    //metodo para impresion de la lista de alquiler
    public void mostrarListaInicioFin() {

        if (!esVacia()) {
            String datos = "<=>";
            clsNodoAlquiler aux = cabeza;
            while (aux != null) {

                System.out.println("Hola2");
                datos = datos + "[" + " Placa: " + aux.getDato().getId() 
                        + ", Año: " + aux.getDato().getPlaca() + ", Dias: " 
                        + aux.getDato().getCantDias() + "]  <=>  ";
                aux = aux.getNext();
            }
            System.out.println(datos + "Mostrando lista");

        }

    }
    //metodo toString convencional 
    public String toString() {
        clsNodoAlquiler aux = cabeza;
        String s = "Lista: ";

        if (aux != null) {
            s += aux + ", ";
            aux = aux.getNext();
            while (aux != cabeza) {
                System.out.println("Hola3");
                s += aux + ", ";
                aux = aux.getNext();
            }
        } else {
            s += "vacia";
        }
        return s;

    }

}
