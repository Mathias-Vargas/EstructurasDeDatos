/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Nodo {

    private int cedula;
    private String nombre;
    private boolean discapacidad;

    Nodo atras;

    public Nodo() {
        this.cedula = 0;
        this.nombre = " ";
        this.discapacidad = true;
        this.atras = null;
    }

    public Nodo(int cedula, String nombre, boolean discapacidad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.discapacidad = discapacidad;
    }

    public Nodo getAtras() {
        return atras;
    }

    public void setAtras(Nodo atras) {
        this.atras = atras;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    @Override
    public String toString() {
        return "Nodo{" + "cedula=" + cedula + ", nombre=" + nombre + ", discapacidad=" + discapacidad + '}';
    }

}
