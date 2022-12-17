
public class clsNodoVehiculos {

    public static clsVehiculos dato;
     public static clsNodoVehiculos next;
     public static clsNodoVehiculos back;

    public clsNodoVehiculos(clsVehiculos dato) {
        this.dato = dato;
    }


    public clsVehiculos getDato() {
        return dato;
    }

    public void setDato(clsVehiculos dato) {
        this.dato = dato;
    }

    public clsNodoVehiculos getNext() {
        return next;
    }

    public void setNext(clsNodoVehiculos next) {
        this.next = next;
    }

    public clsNodoVehiculos getBack() {
        return back;
    }

    public void setBack(clsNodoVehiculos back) {
        this.back = back;
    }
  

}
