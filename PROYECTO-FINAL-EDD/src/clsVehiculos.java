
public class clsVehiculos {

    private String  anio, cilindrada, capacidadPasajeros, precioAlq;
    private String numeroPlaca, marca, modelo, color, tipoDeCombustible, extras, estado;

    public clsVehiculos(String numeroPlaca, String anio, String cilindrada, String capacidadPasajeros, String precioAlq, String marca, String modelo, String color, String tipoDeCombustible, String extras, String estado) {
        this.numeroPlaca = numeroPlaca;
        this.anio = anio;
        this.cilindrada = cilindrada;
        this.capacidadPasajeros = capacidadPasajeros;
        this.precioAlq = precioAlq;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipoDeCombustible = tipoDeCombustible;
        this.extras = extras;
        this.estado = estado;
    }

    public clsVehiculos() {
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(String capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getPrecioAlq() {
        return precioAlq;
    }

    public void setPrecioAlq(String precioAlq) {
        this.precioAlq = precioAlq;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
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

    @Override
    public String toString() {
        return "clsVehiculos{" + "numeroPlaca=" + numeroPlaca + ", anio="
                + anio + ", cilindrada=" + cilindrada + ", capacidadPasajeros="
                + capacidadPasajeros + ", precioAlq=" + precioAlq + ", marca="
                + marca + ", modelo=" + modelo + ", color=" + color
                + ", tipoDeCombustible=" + tipoDeCombustible + ", extras="
                + extras + ", estado=" + estado +'}' + "\n";
    }

}
