package com.example;
// 4. Crear una clase Manufacturer:
public class Manufacturer {

    // Atributos:
    private String name;
    private String cif;
    private Integer year;

    // Constructores:
       // Vacío:
    public Manufacturer() { }

       // Con Parámetros:
    public Manufacturer(String name, String cif, Integer year) {
        this.name = name;
        this.cif = cif;
        this.year = year;
    }

    // Métodos getter y setter:

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getCif() { return cif; }

    public void setCif(String cif) { this.cif = cif; }

    public Integer getYear() { return year; }

    public void setYear(Integer year) { this.year = year; }

    // toString: Template [String concat(+)]
    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", cif='" + cif + '\'' +
                ", year=" + year +
                '}';
    }
}
