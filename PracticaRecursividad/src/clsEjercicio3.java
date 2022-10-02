/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1;

/**
 *
 * @author Jeffrey Mojica S
 */
public class clsEjercicio3 {

//método que comprueba si n está en binario
//ejemplo: n = 101011 -> true
    public boolean binarioR(int n) {
        if (n > 9) { // Comprueba si n es mayo a 9
            if (n % 10 == 0 || n % 10 == 1) { //Valida si el modulo de n es 0 o 1
                return binarioR(n / 10);  //Retorna la recursividad
            } else {
                return false;
            }
        } else if (n == 0 || n == 1) { //Valida si n es igual a 0 o 1
            return true;
        } else {
            return false;
        }
    }

   
}
