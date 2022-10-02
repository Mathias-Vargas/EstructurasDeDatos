
public class clsEjercicio2 {

    public int sumaR(int numero) {
        if (numero == 1) {
            return 1;
        } else {
            return numero + sumaR(numero - 1);
        }
    }
}
