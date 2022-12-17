/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jeffrey Mojica S
 */
public class clsAtributosAlquiler {
  
    
    private String id,marca, extras, estado;
    private int cantDias, pasajeros, placa;

    public clsAtributosAlquiler(String id, int placa, int cantDias, int pasajeros, String marca, String extras, String estado) {
        this.id = id;
        this.placa = placa;
        this.cantDias = cantDias;
        this.pasajeros = pasajeros;
        this.marca = marca;
        this.extras = extras;
        this.estado = estado;
    }

    public clsAtributosAlquiler() {
    }
    
    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getCantDias() {
        return cantDias;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "clsAtributosAlquiler{" + "id=" + id + "placa=" + placa + ", cantDias=" + cantDias + ", pasajeros=" + pasajeros + ", marca=" + marca + ", extras=" + extras + ", estado=" + estado +'}' + " \n ";
    }
    
}
