
package tarea1;

public class clsEjercicio4 {

    public int calcExponencialR(int n, int x) { //Se pasan 2 parametros.
        if (x == 0) { // Compara si el numero es igual a cero.
            return 1;
        } else if (x < 0) { //Valida si el numero es menor a cero.
            return calcExponencialR(n, x + 1) / n; //Retorna recursividad.
        } else {
            return n * calcExponencialR(n, x - 1); //Retorna recursividad.
        }
    }

    public int factorialR(int num) { //Se pasa 1 parametro.
        if (num == 0) { // Compara si el parametro es igualado.
            return 1;
        } else {
            return num * factorialR(num - 1); //Retorna factorial.
        }
    }
    
    public double calcExponencial(int n, int x){
    double result = 0;
    for (int i=0; i<n; i++){
        result = result + (Math.pow(x,i) / factorial(i));
    } return result;
}
public double factorial(int num){
    double result = 1;
    for (int i=1; i<= num; i++){
        result = result * i;
    }return result;
}



}
