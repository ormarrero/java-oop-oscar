package com.example;

public class Est_Productos {

    // Suma todos los productos y salta los precios que sean igual a null
    public double sumaPrecios(Producto[] productos) {
        double sumaPrecio = 0d;

        for (int i = 0; i < productos.length; i++)
            if (productos[i].getPrecio() != null)
                sumaPrecio += productos[i].getPrecio();

        return sumaPrecio;
    }

    // Cuenta todos los productos y salta las cantidades que sean igual a null
    public int cont(Producto[] productos) {
        int cont = 0;

        for (Producto product : productos)
            if (product.getPrecio() != null)
                cont++;

        return cont;
    }

    // Calcula el promedio de todos los productos y salta las cantidades y los precios que sean igual a null
    public double promPrecio(Producto[] productos) {

        double PrecioTotal = this.sumaPrecios(productos);
        int cont = this.cont(productos);

        if (cont <= 0)
            return 0d;

        return PrecioTotal / cont;
    }

    // Calcula el precio mayor de todos los productos y salta las cantidades y los precios que sean igual a null
    public double mayorPrecio(Producto[] productos) {
        double mayorPrecio = 0d;

        for (Producto producto : productos) {

            if (producto.getPrecio() != null && producto.getPrecio() > mayorPrecio)
                mayorPrecio = producto.getPrecio();

        }
        return mayorPrecio;
    }

    // Calcula el precio menor de todos los productos y salta las cantidades y los precios que sean igual a null
    public double menorPrecio(Producto[] productos) {
        double menorPrecio = this.mayorPrecio(productos);

        for (Producto producto : productos) {

            if (producto.getPrecio() == null)
                continue;

            menorPrecio = Math.min(menorPrecio, producto.getPrecio());

        }
        return menorPrecio;
    }

    /* Calcula la Suma todos los productos teniendo en cuenta la cantidad de prodcuctos
         y salta los precios que sean igual a null.     */
    public double sumaPrecioPorCantidad(Producto[] productos) {
        double PrecioTotal = 0d;

        for (Producto producto : productos) {
            if (producto.getPrecio() == null || producto.getCantidad() == null)
                continue;

            double PrecioProducto = producto.getPrecio() * producto.getCantidad();
            PrecioTotal += PrecioProducto;
        }

        return PrecioTotal;
    }
}
