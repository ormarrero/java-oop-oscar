package com.example;

public class Main {

    // 1. Crear una clase Main:
    public static void main(String[] args) {

        // Falta crear fabricantes
        //Manufacturer samsung = new Manufacturer("Samsung", "1234A", 1980);
        //Manufacturer apple = new Manufacturer("Apple", "2222B", 1970);

        // 1.1. Crear 5 productos (CLASE PRODUCTO ASOCIADA CON CLASE MANUFACTURER)
        Producto producto1 = new Producto("Monitor 14", 15.30d, 5, "blanco", 50);
        Producto producto2 = new Producto("Mouse", 7.39d, 2, "negro", 10);
        Producto producto3 = new Producto("Auriculares", null, 15, "azul", 8);
        Producto producto4 = new Producto("Teclado", 15.99d, 4, "gris", 15);
        Producto producto5 = new Producto("Memoria", 45.25d, null, "verde", 5);

        // 1.2. Crear un array de productos
        Producto[] productos = {producto1, producto2, producto3, producto4, producto5};

        // 1.3. Crear objeto para cálculo de estadísticas de productos
        Est_Productos est_producto = new Est_Productos();

        // 1.4. Calcular estadísticas

        // 1.4.1. Calcular la suma del precio total de los productos del array
        double PrecioTotal = est_producto.sumaPrecios(productos);
        int cont = est_producto.cont(productos);
        // 1.4.2. Calcular el promedio del precio total de los productos del array
        double promPrecio = est_producto.promPrecio(productos);
        // 1.4.3. Calcular el precio mayor de los productos del array
        double mayorPrecio = est_producto.mayorPrecio(productos);
        // 1.4.4. Calcular el precio menor de los productos del array
        double menorPrecio = est_producto.menorPrecio(productos);
        // 1.4.5. Calcular la suma de los productos con respecto a la cantidad del array
        double PrecioEnStock = est_producto.sumaPrecioPorCantidad(productos);

        // 1.4.5. Imprimir estadísticas
        System.out.println("Precio total de los productos: " + PrecioTotal);
        System.out.println("Número productos: " + cont);

        System.out.println("Precio medio de los productos: " + promPrecio);

        System.out.println("Precio mas caro " + mayorPrecio);

        System.out.println("Precio mas barato " + menorPrecio);

        System.out.println("Precio stock total " + PrecioEnStock);
    }
}
