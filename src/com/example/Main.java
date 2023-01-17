package com.example;

import java.util.Arrays;

public class Main {
    // 1. Crear una clase Main:
    public static void main(String[] args) {
        // 1.1. Crear 5 productos
        Producto producto1 = new Producto("p001","Monitor 14", 60.95 );
        Producto producto2 = new Producto("p002","Mouse", 7.39 );
        Producto producto3 = new Producto("p003","Auriculares", 30.25 );
        Producto producto4 = new Producto("p004","Teclado", 15.99 );
        Producto producto5 = new Producto("p005","Memoria", 45.25 );

        /* 1.2. Crear un array de productos */
        Producto [] Productos = {producto1, producto2, producto3, producto4, producto5};

        // 2. Estadísticas:
        // 2.1. Calcular la suma del precio total de los productos del array
        double Precio_total = (producto1.getPrecio_producto() + producto2.getPrecio_producto() + producto3.getPrecio_producto() + producto4.getPrecio_producto() + producto5.getPrecio_producto());
        System.out.println("Precio Total = " + Precio_total);

        // 2.2. Calcular la media del precio total de los productos del array
        double Media_Precio_total = (producto1.getPrecio_producto() + producto2.getPrecio_producto() + producto3.getPrecio_producto() + producto4.getPrecio_producto() + producto5.getPrecio_producto())/5;
        System.out.println("Media del Precio Total = " + Media_Precio_total);

        // 2.3. Calcular el precio máximo
        double P_M_1 = Math.max(producto1.getPrecio_producto(), producto2.getPrecio_producto());
        double P_M_2 = Math.max(P_M_1, producto2.getPrecio_producto());
        double P_M_3 = Math.max(P_M_2, producto3.getPrecio_producto());
        double P_M_4 = Math.max(P_M_3, producto4.getPrecio_producto());
        double P_M_5 = Math.max(P_M_4, producto5.getPrecio_producto());
        System.out.println("El Precio Máximo es: " + P_M_5);
    }

}
