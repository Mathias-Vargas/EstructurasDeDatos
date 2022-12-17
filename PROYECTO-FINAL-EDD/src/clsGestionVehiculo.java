
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

//Antes
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

//Despues INTERFAZ GRAFICA
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

//Antes
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

//Despues INTERFAZ GRAFICA
    public boolean removerEnPosicion(String placa) {

        if (cabeza == null) {
          //  System.out.println("1");
            return false;
        } else {
               System.out.println(cabeza.getDato().getNumeroPlaca());
               System.out.println(placa);
            clsNodoVehiculos aux = this.cabeza;
            if (cabeza.getDato().getNumeroPlaca().equalsIgnoreCase(placa)) {
              //  System.out.println("2");
                this.eliminarprimero();
                return true;
            } else if (ultimo.getDato().getNumeroPlaca().equalsIgnoreCase(placa)) {
               // System.out.println("3");
                this.eliminarUltimo();
                return true;
            } else {
                //System.out.println("4");
                while (aux.getNext() != null) {
                   // System.out.println("5");
                    if (aux.getDato().getNumeroPlaca().equalsIgnoreCase(placa)) {
                       // System.out.println("6");
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

    /* public void removerPrimero() {
        if (this.esVacia()) {
            JOptionPane.showMessageDialog(null, "La lista está vacia");
        } else {
            //si hay un solo nodo
            if (this.cabeza.getNext() == null) {
                this.ultimo = null;
            } else {
                cabeza.getNext().setBack(null);
            }
            this.cabeza = cabeza.getNext();
            this.cantNodos--;
        }
    }*/
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

    /* public void removerUltimo() {
        if (this.esVacia()) {
            JOptionPane.showMessageDialog(null, "La lista está vacia");
        } else {
            clsNodoVehiculos aux = cabeza;
            clsNodoVehiculos temp = cabeza;
            //si hay un solo nodo
            if (this.cabeza.getNext() == null) {
                cabeza = null;
            } else {
                this.ultimo.getBack().setNext(null);
            }
            this.ultimo = ultimo.getBack();
            this.cantNodos--;
        }
    }*/
//Antes INTERFAZ GRAFICA
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

//Despues
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

//Antes  con algunos cambios
/*    public String consultaVehiculos(String numeroPlaca) {
        String placaVehiculo = " ";
        String anio = " ";
        if (cabeza != null) {
            clsNodoVehiculos aux = cabeza;

            while (aux.getDato().getNumeroPlaca().equalsIgnoreCase(numeroPlaca)) {
                aux = aux.getNext();
            }
            //   JOptionPane.showMessageDialog(null, aux);
            //  System.out.println(aux);
           
            placaVehiculo = aux.getDato().getNumeroPlaca();
            anio = aux.getDato().getAnio();

        } else {
            JOptionPane.showMessageDialog(null, "El Vehculo con esos datos no existe");
        }

        return placaVehiculo + "," + anio;
    }
*/

//Antes
 public String consultaVehiculos(String numeroPlaca) {
  String placaVehiculo = " ";
        if (cabeza != null) {
            clsNodoVehiculos aux = cabeza;
            while (aux.getDato().getNumeroPlaca().equalsIgnoreCase(numeroPlaca)) {
                aux = aux.getNext();
            }
             placaVehiculo = aux.getDato().getNumeroPlaca();
           // JOptionPane.showMessageDialog(null, aux);
            System.out.println(placaVehiculo);
        }
        return placaVehiculo;

    }





//Despues INTERFAZ GRAFICA
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
//Para el main
        System.out.println(placaVehiculo + "," + anio + "," + cilindrada + ","
                + capacidadPasajeros + "," + precioAlq + "," + marca + ","
                + modelo + "," + color + "," + tipoDeCombustible + ","
                + extras + "," + estado);

        return placaVehiculo + "," + anio + "," + cilindrada + ","
                + capacidadPasajeros + "," + precioAlq + "," + marca + ","
                + modelo + "," + color + "," + tipoDeCombustible + ","
                + extras + "," + estado;
    }


public void mostrarListaInicioFin(){

    if (!esVacia()) {
       String datos = "<=>" ;
       clsNodoVehiculos aux= ultimo;
while(aux!= null){

datos = datos + "["+" Placa: " + aux.getDato().getNumeroPlaca() + ", Año: " + aux.getDato().getAnio()+ ", Pasajeros: " + aux.getDato().getCapacidadPasajeros() + "  Estado: " + aux.getDato().getEstado()+ "]  <=>  ";
 aux = aux.getBack();
}
        System.out.println(datos + "Mostrando lista");
//JOptionPane.showMessageDialog(null, datos, "Mostrando lista", JOptionPane.INFORMATION_MESSAGE);

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
