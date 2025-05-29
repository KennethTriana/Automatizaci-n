package co.com.AutoLGC.models;

public class CredencialesVenta {
    private String nombre;

    private String cantidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public CredencialesVenta(String nombre, String cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
}

