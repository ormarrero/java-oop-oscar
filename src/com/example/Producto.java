package com.example;

import java.util.StringJoiner;

public class Producto {

    // 1. Atributos Encapsulados:
    private String id_producto;
    private String nombre_producto;
    private double precio_producto;

     // 2. Constructores:

    public Producto() {
    }

    public Producto(String id_producto, String nombre_producto, double precio_producto) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.precio_producto = precio_producto;
    }

    // Métodos getter y setter:

    public double getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(double precio_producto) {
        this.precio_producto = precio_producto;
    }

    // toString:

    @Override
    public String toString() {
        return new StringJoiner(", ", Producto.class.getSimpleName() + "[", "]")
                .add("id_producto='" + id_producto + "'")
                .add("nombre_producto='" + nombre_producto + "'")
                .add("precio_producto=" + precio_producto)
                .toString();
    }

}
