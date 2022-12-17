/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jeffrey Mojica S
 */
public class clsCliente {
    
       
    private String cedula = " ", nombre = " ", nacimiento = " ", correo = " ", categoria = " ";

    public clsCliente(String cedula, String nombre, String nacimiento, String correo, String categoria) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.correo = correo;
        this.categoria = categoria;
    }

    public clsCliente() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "clsCliente{" + "cedula=" + cedula + ", nombre=" + nombre
                + ", nacimiento=" + nacimiento + ", correo=" + correo 
                + ", categoria=" + categoria + '}' + "\n";
    }
     
     
    
    
    
}
