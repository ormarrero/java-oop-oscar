package com.example;
// 1. Crear una clase Producto:
public class Producto {

// 1.1. Atributos Encapsulados(private):
    private String nombre;
    private Double precio;
    private Integer cantidad;
    private String color;
    private Integer peso;

    //Falta agregar asociaciones/relaciones
    //private Manufacturer manufacturer;
    //private ProductCategory category;

// 1.2. Constructores:
   // 1.2.1. Vacío:
    public Producto() { }
   // 1.2.2. Con parámetros:
// agregar Manufacturer manufacturer, ProductCategory category en los parametros
    public Producto(String nombre, Double precio, Integer cantidad, String color, Integer peso) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.color = color;
        this.peso = peso;
        //this.manufacturer = manufacturer;
        //        this.category = category;
    }

// 1.3. Métodos getter y setter:

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public Double getPrecio() { return precio; }

    public void setPrecio(Double precio) { this.precio = precio; }

    public Integer getCantidad() { return cantidad; }

    public void setCantidad(Integer cantidad) { this.cantidad = cantidad; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public Integer getPeso() { return peso; }

    public void setPeso(Integer peso) { this.peso = peso; }


// 1.4. toString: [Template:String concat(+)]

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                '}';
    }
}
