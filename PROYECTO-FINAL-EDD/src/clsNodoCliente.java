/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jeffrey Mojica S
 */
public class clsNodoCliente {

   
     public static clsCliente dato;
     public static clsNodoCliente next;

    public clsNodoCliente(clsCliente dato) {
        this.dato = dato;

    }

    public clsNodoCliente() {
        this.next = null;
    }

    public clsCliente getDato() {
        return dato;
    }

    public void setDato(clsCliente dato) {
        this.dato = dato;
    }

    public clsNodoCliente getNext() {
        return next;
    }

    public void setNext(clsNodoCliente next) {
        this.next = next;
    }

   

    /*
    @Override
    public String toString() {
        return "clsNodoCliente{" + "dato=" + dato + '}';
    }

     */
}
