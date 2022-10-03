//Alejandro A
//Jeffrey M
//Fabian A
//Mathias V
package tarea1;

import static tarea1.clsEjercicio1.sacarVocalesR;

public class main {

    public static void main(String[] args) {
        clsEjercicio1 ej1 = new clsEjercicio1();
        clsEjercicio2 ej2 = new clsEjercicio2();
        clsEjercicio3 ej3 = new clsEjercicio3();
        clsEjercicio4 ej4 = new clsEjercicio4();

        System.out.print("\n" + ej2.sumaR(5) + "\n");
        System.out.println(ej3.binarioR(1011001) + "\n");
        System.out.println(ej4.calcExponencialR(5,6) + "\n");
        System.out.println(ej4.factorialR(3) + "\n");
        
        String cad = "Jeffrey";// Ingresa los datos
        char[] array = cad.toCharArray();
        array = sacarVocalesR(0, array);
        String string = String.valueOf(array);
        System.out.println(string);
        ej1.sacarVocalesR(0, array);
    }
}
