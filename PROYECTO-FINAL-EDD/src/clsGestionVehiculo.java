
import javax.crypto.AEADBadTagException;
import javax.swing.JOptionPane;

public class clsGestionVehiculo {

    private clsNodoVehiculos cabeza;
    private clsNodoVehiculos ultimo;
    private int cantNodos;

    public clsGestionVehiculo() {
        this.cabeza = null;
        this.ultimo = null;
    }

    public boolean esVacia() {
        return (this.cabeza == null);
    }

    public void registraVehiculo(clsVehiculos v) {
        if (cabeza == null) {
            cabeza = new clsNodoVehiculos(v);
            ultimo = cabeza;
        } else {
            clsNodoVehiculos aux = new clsNodoVehiculos(v);
            aux.setNext(cabeza);
            cabeza = aux;
        }
        ultimo.setNext(cabeza);
        this.cantNodos++;
    }

    public void registrar(clsVehiculos v) {

        clsNodoVehiculos newnode = new clsNodoVehiculos(v);

        if (esVacia()) {
            cabeza = ultimo = newnode;
        } else {
            newnode.setNext(cabeza);
            cabeza = newnode;
            cabeza.getNext().setBack(newnode);
        }
    }

    public boolean eliminaVehiculo(String numeroPlaca) {
        if (cabeza != null) {
            if (cabeza.getDato().getNumeroPlaca() == numeroPlaca) {
                cabeza = cabeza.getNext();
            } else {
                clsNodoVehiculos aux = cabeza;
                while (aux.getNext() != null) {
                    if (aux.getNext().getDato().getNumeroPlaca() == numeroPlaca) {
                        aux.setNext(aux.getNext().getNext());
                        return true;
                    }
                    aux = aux.getNext();

                }

            }
        }
        return false;
    }

    public boolean esPosicionValida(int indice) {
        return (indice > 0 && indice <= this.cantNodos) || (indice > 0 && indice == this.cantNodos + 1);
    }

    public boolean removerEnPosicion(String placa) {

        if (cabeza == null) {

            return false;
        } else {
            System.out.println(cabeza.getDato().getNumeroPlaca());
            System.out.println(placa);
            clsNodoVehiculos aux = this.cabeza;
            if (cabeza.getDato().getNumeroPlaca().equalsIgnoreCase(placa)) {

                this.eliminarprimero();
                return true;
            } else if (ultimo.getDato().getNumeroPlaca().equalsIgnoreCase(placa)) {

                this.eliminarUltimo();
                return true;
            } else {

                while (aux.getNext() != null) {

                    if (aux.getDato().getNumeroPlaca().equalsIgnoreCase(placa)) {

                        aux.getBack().setNext(aux.getNext());
                        aux.getNext().setBack(aux.getBack());

                        return true;
                    }
                    aux = aux.getNext();

                }
            }
        }
        return false;
    }

    public void eliminarprimero() {
        if (cabeza != null) {
            if (cabeza == ultimo) {
                cabeza = ultimo = null;
            } else {
                cabeza = cabeza.getNext();
                cabeza.setBack(null);
            }
        }
    }

    public void eliminarUltimo() {
        if (ultimo != null) {
            if (cabeza == ultimo) {
                cabeza = ultimo = null;
            } else {
                ultimo = ultimo.getBack();
                ultimo.setNext(null);
            }
        }
    }

    public void modificarVehiculo(clsVehiculos v) {
        if (cabeza != null) {
            clsNodoVehiculos aux = cabeza;
            while (aux != null && aux.getDato().getNumeroPlaca() != v.getNumeroPlaca()) {
                aux = aux.getNext();
            }
            if (aux != null && aux.getDato().getNumeroPlaca() == v.getNumeroPlaca()) {
                aux.getDato().setAnio(v.getAnio());
                aux.getDato().setCapacidadPasajeros(v.getCapacidadPasajeros());
                aux.getDato().setMarca(v.getMarca());
                aux.getDato().setCilindrada(v.getCilindrada());
                aux.getDato().setColor(v.getColor());
                aux.getDato().setExtras(v.getExtras());
                aux.getDato().setModelo(v.getModelo());
                aux.getDato().setEstado(v.getEstado());
                aux.getDato().setPrecioAlq(v.getPrecioAlq());
                aux.getDato().setTipoDeCombustible(v.getTipoDeCombustible());
            }
        }
    }

    public boolean modifcar(String numeroPlaca, String anio, String cilindrada, String capacidadPasajeros, String precioAlq, String marca, String modelo, String color, String tipoDeCombustible, String extras, String estado) {

        clsNodoVehiculos aux = this.cabeza;
        boolean respuesta = false;
        int contador = 1;
        if (esVacia()) {
            JOptionPane.showMessageDialog(null, "El Cliente con esos datos no existe");
        } else {
            do {
                if (aux != null && aux.getDato().getNumeroPlaca().equalsIgnoreCase(numeroPlaca)) {
                    if (!(aux.getDato().getAnio()).equalsIgnoreCase((anio))) {
                        aux.getDato().setAnio(anio);
                    } else if (!aux.getDato().getCapacidadPasajeros().equalsIgnoreCase(capacidadPasajeros)) {
                        aux.getDato().setCapacidadPasajeros(capacidadPasajeros);
                    } else if (!aux.getDato().getMarca().equalsIgnoreCase(marca)) {
                        aux.getDato().setMarca(marca);
                    } else if (!aux.getDato().getCilindrada().equalsIgnoreCase(cilindrada)) {
                        aux.getDato().setCilindrada(cilindrada);
                    } else if (!aux.getDato().getColor().equalsIgnoreCase(color)) {
                        aux.getDato().setColor(color);
                    } else if (!aux.getDato().getExtras().equalsIgnoreCase(extras)) {
                        aux.getDato().setExtras(extras);
                    } else if (!aux.getDato().getModelo().equalsIgnoreCase(modelo)) {
                        aux.getDato().setModelo(modelo);
                    } else if (!aux.getDato().getEstado().equalsIgnoreCase(estado)) {
                        aux.getDato().setEstado(estado);
                    } else if (!aux.getDato().getPrecioAlq().equalsIgnoreCase((precioAlq))) {
                        aux.getDato().setPrecioAlq(precioAlq);
                    } else if (!aux.getDato().getTipoDeCombustible().equalsIgnoreCase(tipoDeCombustible)) {
                        aux.getDato().setTipoDeCombustible(tipoDeCombustible);
                    }

                    respuesta = true;
                }
                aux = aux.getNext();
                contador++;
            } while (aux != null);
        }
        return respuesta;
    }

    public String consultaVehiculos(String numeroPlaca) {
        String placaVehiculo = " ";
        if (cabeza != null) {
            clsNodoVehiculos aux = cabeza;
            while (aux.getDato().getNumeroPlaca().equalsIgnoreCase(numeroPlaca)) {
                aux = aux.getNext();
            }
            placaVehiculo = aux.getDato().getNumeroPlaca();

            System.out.println(placaVehiculo);
        }
        return placaVehiculo;

    }

    public String consultar(String numeroPlaca) {
        clsNodoVehiculos aux = this.cabeza;
        String anio = " ", cilindrada = " ", capacidadPasajeros = " ", precioAlq = " ";
        String placaVehiculo = " ", marca = " ", modelo = " ", color = " ", tipoDeCombustible = " ", extras = " ", estado = " ";
        int contador = 1;
        if (esVacia()) {
            JOptionPane.showMessageDialog(null, "Esta vacia");
        } else {
            do {
                if (aux.getDato().getNumeroPlaca().equalsIgnoreCase(numeroPlaca)) {

                    estado = aux.getDato().getEstado();
                    placaVehiculo = aux.getDato().getNumeroPlaca();
                    anio = aux.getDato().getAnio();
                    cilindrada = aux.getDato().getCilindrada();
                    capacidadPasajeros = aux.getDato().getCapacidadPasajeros();
                    precioAlq = aux.getDato().getPrecioAlq();
                    marca = aux.getDato().getMarca();
                    modelo = aux.getDato().getColor();
                    color = aux.getDato().getColor();
                    tipoDeCombustible = aux.getDato().getTipoDeCombustible();
                    extras = aux.getDato().getExtras();

                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "El vehiculo con esos datos no existe");
                }
                aux = aux.getNext();
                contador++;
            } while (aux != cabeza);
        }

        System.out.println(placaVehiculo + "," + anio + "," + cilindrada + ","
                + capacidadPasajeros + "," + precioAlq + "," + marca + ","
                + modelo + "," + color + "," + tipoDeCombustible + ","
                + extras + "," + estado);

        return placaVehiculo + "," + anio + "," + cilindrada + ","
                + capacidadPasajeros + "," + precioAlq + "," + marca + ","
                + modelo + "," + color + "," + tipoDeCombustible + ","
                + extras + "," + estado;
    }

    public void mostrarListaInicioFin() {

        if (!esVacia()) {
            String datos = "<=>";
            clsNodoVehiculos aux = ultimo;
            while (aux != null) {

                datos = datos + "[" + " Placa: " + aux.getDato().getNumeroPlaca() + ", Año: " + aux.getDato().getAnio() + ", Pasajeros: " + aux.getDato().getCapacidadPasajeros() + "  Estado: " + aux.getDato().getEstado() + "]  <=>  ";
                aux = aux.getBack();
            }
            System.out.println(datos + "Mostrando lista");

        }
    }

    @Override
    public String toString() {
        clsNodoVehiculos aux = cabeza;
        String s = "Lista: ";
        if (aux != null) {
            s += aux + ", ";
            aux = aux.getNext();
            while (aux != cabeza) {
                s += aux + ", ";
                aux = aux.getNext();
            }
        } else {
            s += "vacia";
        }
        return s;
    }

}
