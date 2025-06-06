package org.example;

public class Productos {
    String Nombre;
    Double Precion;

    public Productos(String nombre, Double precion) {
        Nombre = nombre;
        Precion = precion;
    }

    public String getNombre() {
        return Nombre;
    }

    public Double getPrecion() {
        return Precion;
    }
}
