package org.example.pregunta4;

public class Producto {

    private String nombre;
    private double precio;
    private int cantidad;


    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }


    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " | Precio: " + precio + " | Cantidad: " + cantidad;
    }

}
