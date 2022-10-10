/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alejandro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila miPila = new Pila();
        
        miPila.push(3);
        miPila.push(2);  
        miPila.push(0);
        miPila.listar(); 
        System.out.println("La suma de los cubiertos es: " + 
                miPila.sumaDeCubiertos());
    }
}
