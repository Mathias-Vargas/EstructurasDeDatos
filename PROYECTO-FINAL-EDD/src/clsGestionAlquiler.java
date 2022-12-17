
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

    //   clsGestionCliente gc = new clsGestionCliente();
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

    /*public void cantidadDias(String id) {
        // ListaDobleEnlazada gc = new ListaDobleEnlazada();
        clsGestionCliente gc = new clsGestionCliente();
        String cedula = " ";
        clsCliente cliente = new clsCliente();
        cedula = cliente.getCedula();

        clsNodoCliente aux = cabezaC;
        clsNodoAlquiler aux2 = cabeza;

        while (aux2.getNext() != null && aux2.getDato().getId() != id) {
            System.out.println("Hola1");

            aux2 = aux2.getNext();
            System.out.println("aaaaa");
        }

        while (cedula != id) {
            System.out.println("Hola2A");
            //gc.AvanzarLista(id);
            // gc.AvanzarLista();
            aux = aux.getNext();
            // nc = nc.getNext();
            //System.out.println(aux);

        }

        if (aux2.getDato().getId() == cedula) {
            System.out.println("Hola3");
            if (aux2.getDato().getCantDias() >= 30) {
                System.out.println("Hola4");
                //varios ifs para categoria
                aux.getDato().setCategoria("ORO");
            }
        }
    }*/

public String consultar(String numeroPlaca) {
        clsNodoAlquiler aux = this.cabeza;
        String id = " ", marca = " ";
        String  extras = " ", estado = " ";
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
                    JOptionPane.showMessageDialog(null, id + "," + placa + "," + cantDias + "," + pasajeros + "," + marca + "," + extras + "," + estado);
                }
                aux = aux.getNext();
                contador++;
            } while (aux != cabeza);
        }
        System.out.println(id + "," + placa + "," + cantDias + "," + pasajeros + "," + marca + "," + extras + "," + estado);
        return id + "," + placa + "," + cantDias + "," + pasajeros + "," + marca + "," + extras + "," + estado;

}






    public void cantidadDiasS(String id) {
        // ListaDobleEnlazada gc = new ListaDobleEnlazada();
        /*clsGestionCliente gc = new clsGestionCliente();
        String cedula = " ";
        clsCliente cliente = new clsCliente();
        cedula = cliente.getCedula();*/

        clsNodoCliente aux = cabezaC;
        clsNodoAlquiler aux2 = cabeza;
        // System.out.println("Aqui");

        /*while (aux2.getNext() != null && aux2.getDato().getId() != id) {
            System.out.println("primero");
            aux2 = aux2.getNext();
        }*/
        System.out.println("AAA");
        /*  while (clsNodoCliente.next != null && clsNodoCliente.dato.getCedula() != id) {
            System.out.println("segundo");
            aux = aux.getNext();

        }*/
        System.out.println("BBB");
        // if (aux2.getDato().getId().equalsIgnoreCase(id)) {
        System.out.println("Tercero");
        if (aux2.getDato().getCantDias() >= 30) {
            System.out.println("CCC");
            if (clsNodoCliente.dato.getCategoria().equalsIgnoreCase("Bronce") || clsNodoCliente.dato.getCategoria().equalsIgnoreCase("bronce") ) {
                clsNodoCliente.dato.setCategoria("Plata");
            } else if (clsNodoCliente.dato.getCategoria().equalsIgnoreCase("Plata") || clsNodoCliente.dato.getCategoria().equalsIgnoreCase("plata")) {
                clsNodoCliente.dato.setCategoria("Oro");
            } else {
                clsNodoCliente.dato.setCategoria("Zafiro");
            }

          
        }

    }


 //varios ifs para categoria
            // aux.getDato().setCategoria("ORO");
            //  cabezaC.getDato().setCategoria("0r0");
            //   aux.getDato().setCategoria("Oro");
        //  }

        /*while (clsNodoCliente.next != null && clsNodoCliente.dato.getCedula() !=id) {
            System.out.println("Hola2A");
             
         // clsNodoCliente.next.getNext();
          aux = aux.getNext();
            //gc.AvanzarLista(id);
            // gc.AvanzarLista();
            //aux = aux.getNext();
            // nc = nc.getNext();
            //System.out.println(aux);

        }*/


    public void asignaVehiculos(clsAtributosAlquiler v) {
        clsNodoAlquiler aux2 = cabeza;
        clsNodoVehiculos vehiculo = cabezaV;
        String estado;
        estado = "Registrada";

        while (aux2.getNext() != null && aux2.getDato().getEstado() != estado) {
            aux2 = aux2.getNext();
        }
        while (clsNodoVehiculos.next != null && Integer.parseInt(clsNodoVehiculos.dato.getCapacidadPasajeros()) != aux2.getDato().getPasajeros()) {
            vehiculo = vehiculo.getNext();
        }

        if (aux2.getDato().getEstado() == "Registrada") {
            if (aux2.getDato().getPasajeros() == Integer.parseInt(clsNodoVehiculos.dato.getCapacidadPasajeros())) {
                aux2.getDato().setPlaca(Integer.parseInt(clsNodoVehiculos.dato.getNumeroPlaca()));
                clsNodoVehiculos.dato.setEstado("Alquilado");
                aux2.getDato().setEstado("Procesada");
                monto = Integer.parseInt(clsNodoVehiculos.dato.getPrecioAlq()) * aux2.getDato().getCantDias() * 0.13;
                JOptionPane.showMessageDialog(null, "El monto a pagar sera: " + monto);
            } else {
                JOptionPane.showMessageDialog(null, "No hay vehiculos disponibles con esas caracteristicas");
                aux2.getDato().setEstado("Rechazada");
            }
        }

    }

    /* public void montoSuperior(String id) {
        clsNodoCliente aux = cabezaC;
        clsNodoAlquiler aux2 = cabeza;

        while (aux2.getNext() != null && aux2.getDato().getId() != id) {
            aux2 = aux2.getNext();
        }

        while (aux.getNext() != null && aux.getDato().getCedula() != id) {
            aux = aux.getNext();
        }

        if (aux.getDato().getCedula() == aux2.getDato().getId()) {
            if (monto >= 70000) {
                aux.getDato().setCategoria("ZAFIRO");
            }
        }

    }
     */
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

    public void devolucionVehiculo(String id, int placa) {
        System.out.println("Cero");
        clsNodoAlquiler aux2 = cabeza;
        clsNodoVehiculos vehiculo = cabezaV;

        while (clsNodoAlquiler.next != null && clsNodoAlquiler.dato.getId() != id && clsNodoAlquiler.dato.getPlaca() != placa) {
            System.out.println("Primero");
            aux2 = aux2.getNext();
        }

        while (clsNodoVehiculos.next != null && Integer.parseInt(clsNodoVehiculos.dato.getNumeroPlaca()) != placa) {
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

    public void desplegarlista() {
        // Crea una copia de la pila.
        clsNodoAlquiler aux = new clsNodoAlquiler();
        aux = cabeza;
        if (cabeza != null) {
            while (aux != null) {
                System.out.println("hola1");
                System.out.println("|\t" + aux.getDato().getId() + " " + aux.getDato().getPlaca() + " "
                        + aux.getDato().getCantDias() + " " + aux.getDato().getPasajeros() + " " + aux.getDato().getMarca()
                        + " " + aux.getDato().getExtras() + " " + aux.getDato().getEstado() + "\t|");
                System.out.println("----------------------------------------");
                aux = aux.getNext();
            }

        } else {     // Recorre la pila hasta el ultimo node.
            System.out.println("Esta vacia");
        }

    }

    public boolean esVacia() {
        return (this.cabeza == null);
    }

    public void mostrarListaInicioFin() {

        if (!esVacia()) {
            String datos = "<=>";
            clsNodoAlquiler aux = cabeza;
            while (aux != null) {

                System.out.println("Hola2");
                datos = datos + "[" + " Placa: " + aux.getDato().getId() + ", Año: " + aux.getDato().getPlaca() + ", Dias: " + aux.getDato().getCantDias() + "]  <=>  ";
                aux = aux.getNext();
            }
            System.out.println(datos + "Mostrando lista");
            //JOptionPane.showMessageDialog(null, datos, "Mostrando lista", JOptionPane.INFORMATION_MESSAGE);

        }

    }

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
