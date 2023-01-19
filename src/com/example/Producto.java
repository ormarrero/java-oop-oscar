package com.example;
// 1. Crear una clase Producto:
public class Producto {

// 1.1. Atributos Encapsulados(private):
    private String nombre;
    private Double precio;
    private Integer cantidad;
    private String color;
    private Integer peso;

    // 4.1. Asociar la clase Manufacturer a Product
    private Manufacturer manufacturer;
    // 5.1. Asociar la enum ProductCategory a Product
    private ProductCategory category;

// 1.2. Constructores:
   // 1.2.1. Vacío:
    public Producto() { }
   // 1.2.2. Con parámetros:
       // 4.1. Agregar Manufacturer manufacturer en los parametros:
       // 5.1. Agregar ProductCategory category en los parametros:
    public Producto(String nombre, Double precio, Integer cantidad, String color, Integer peso, Manufacturer manufacturer, ProductCategory getCategory) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.color = color;
        this.peso = peso;
        // 4.1 Agregar this.manufacturer = manufacturer;:
        this.manufacturer = manufacturer;
        // 5.1 Agregar this.category = category;:
        this.category = category;
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

    // 4.1 Agregar el método get y set de Manufacturer:
    public Manufacturer getManufacturer() { return manufacturer; }

    public void setManufacturer(Manufacturer manufacturer) { this.manufacturer = manufacturer; }

    // 5.1 Agregar el método get y set de ProductCategory:

    public ProductCategory getCategory() { return category; }

    public void setCategory(ProductCategory category) { this.category = category; }


// 1.4. toString: [Template:String concat(+)]
    // 4.1 Crear de nuevo el to String con Manufacturer:
    // 5.1 Crear de nuevo el to String con ProductCategory:

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", manufacturer=" + manufacturer +
                ", category=" + category +
                '}';
    }
}
