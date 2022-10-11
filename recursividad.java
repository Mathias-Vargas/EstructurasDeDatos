/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.examen.recursividad;

/**
 *
 * @author fa550
 */
public class recursividad {
       public int calcCos(int x, int n){
           if (n == 0) { 
            return x;
        } else  { 
            return (int) (Math.pow(-1, n) * Math.pow(x, 2 * n + 1) / factorial(2 * n + 1) +
                    calcCos(x, n - 1));
           }
       }
           public int factorial(int n)
       { 
         if (n <= 0) { 
            return 1;
        } else {
            return n * factorial(n - 1); 
        }
        }  
       
       
       
       
}
