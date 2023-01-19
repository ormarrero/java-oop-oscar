package com.example;

public class Main {

// 2. Crear una clase Main:
    public static void main(String[] args) {

        // 4.1. Crear fabricantes:
        Manufacturer samsung = new Manufacturer("Samsung", "1234A", 1980);
        Manufacturer apple = new Manufacturer("Apple", "2222B", 1970);

    // 2.1. Crear 5 productos:
        // 4.1. (CLASE PRODUCTO ASOCIADA CON CLASE MANUFACTURER) se agregan los fabricantes a los productos:
        Producto producto1 = new Producto("Monitor 14", 15.30d, 5, "blanco", 50, samsung, ProductCategory.ELECTRONIC_DEVICES);
        Producto producto2 = new Producto("Mouse", 7.39d, 2, "negro", 10, apple, ProductCategory.BOOKS);
        Producto producto3 = new Producto("Auriculares", null, 15, "azul", 8, samsung, ProductCategory.FOOD);
        Producto producto4 = new Producto("Teclado", 15.99d, 4, "gris", 15, apple, null);
        Producto producto5 = new Producto("Memoria", 45.25d, null, "verde", 5, samsung, ProductCategory.FOOD);

    // 2.2. Crear un array de productos:
        Producto[] productos = {producto1, producto2, producto3, producto4, producto5};

    // 2.3. Crear objeto para cálculo de estadísticas de productos:
        Est_Productos est_producto = new Est_Productos();

// 3. Calcular estadísticas:

    // 3.1. Calcular la suma del precio total de los productos del array:
        double PrecioTotal = est_producto.sumaPrecios(productos);
        int cont = est_producto.cont(productos);
    // 3.2. Calcular la media de precio de los productos del array:
        double promPrecio = est_producto.promPrecio(productos);
        // 3.2.1. Evitar contabilizar un precio si es nulo en el precio medio:
    // 3.3. Calcular el precio máximo:
        double mayorPrecio = est_producto.mayorPrecio(productos);
    // 3.4. Calcular el precio mínimo:
        double menorPrecio = est_producto.menorPrecio(productos);
    // 3.5. Calcular la suma de los productos con respecto a la cantidad del array
        double PrecioEnStock = est_producto.sumaPrecioPorCantidad(productos);

// 4. Imprimir estadísticas:
    // 4.1.
        System.out.println("Precio total de los productos: " + PrecioTotal);
        System.out.println("Número productos: " + cont);
    // 4.2.
        System.out.println("Precio medio de los productos: " + promPrecio);
    // 4.3.
        System.out.println("Precio mas caro " + mayorPrecio);
    // 4.4.
        System.out.println("Precio mas barato " + menorPrecio);
    // 4.5.
        System.out.println("Precio stock total " + PrecioEnStock);
    }
}
