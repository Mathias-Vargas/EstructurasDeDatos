/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Jeffrey Mojica S
 *   Alejandro Acuña
 *   Mathias Vargas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cola cola1 = new Cola();

        cola1.encola(new Nodo(123, "Mathias", false));
        cola1.encola(new Nodo(456, "Alejandro", false));
        cola1.encola(new Nodo(789, "Jeffrey", false));
        cola1.encola(new Nodo(246, "Fabian", false));
        System.out.println("La cola original es:");
        System.out.println(cola1);
        System.out.println("Atiendo 1 vez");
        System.out.println(cola1.atiende());
        System.out.println("La cola modificada es:");
        System.out.println(cola1);
        System.out.println(cola1.encuentra(123) + "\n");
        System.out.println("Orden de Entrada");
        cola1.pedir(777, "kenneth", true);
        System.out.println(cola1);

    }

}
