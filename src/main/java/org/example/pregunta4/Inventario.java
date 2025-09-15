package org.example.pregunta4;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> productos = new ArrayList<>();


    public void anadirProducto(String nombre) {


        productos.add(new Producto(nombre));
    }

    public void anadirProducto(String nombre,  double precio)  {
        if (precio < 0) {
            throw new IllegalArgumentException("No puede ingresar un precio negativo");
        }
        productos.add(new Producto(nombre, precio));
    }

    public void anadirProducto(String nombre,  double precio, int cantidad) {

        if (precio < 0) {
            throw new IllegalArgumentException("No puede ingresar un precio negativo");
        }
        if (cantidad < 0) {
            throw new IllegalArgumentException("No puede ingresar una cantidad negativa");
        }

        productos.add(new Producto(nombre, precio, cantidad));
    }

    public void mostrarInventario() {
        if (productos.isEmpty()) {
            System.out.println("📦 El inventario está vacío.");
        } else {
            for (Producto p : productos) {
                System.out.println(p);
            }
        }
    }

    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        try {
            inventario.anadirProducto("Arroz");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            inventario.anadirProducto("Arroz", -6);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            inventario.anadirProducto("Arroz", 1, 4);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        inventario.mostrarInventario();

    }


}
