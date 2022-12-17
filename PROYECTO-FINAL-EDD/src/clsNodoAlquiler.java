/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jeffrey Mojica S
 */
public class clsNodoAlquiler {
     public static clsAtributosAlquiler dato;
     public static clsNodoAlquiler next;

    public clsNodoAlquiler(clsAtributosAlquiler dato) {
        this.dato = dato;
    }

    clsNodoAlquiler() {
       
    }

    public clsNodoAlquiler getNext() {
        return next;
    }

    public void setNext(clsNodoAlquiler next) {
        this.next = next;
    }

    public clsAtributosAlquiler getDato() {
        return dato;
    }

    public void setDato(clsAtributosAlquiler dato) {
        this.dato = dato;
    }
    
    

    @Override
    public String toString() {
        return "clsNodoAlquiler{" + "dato=" + dato + '}';
    }
}
