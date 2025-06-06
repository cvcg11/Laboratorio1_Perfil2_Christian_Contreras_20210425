package org.example;

public class Productos {
    int id
    String Nombre;
    Double Precion;

    public Productos(int id, String nombre, Double precion) {
        this.id = id;
        Nombre = nombre;
        Precion = precion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return Nombre;
    }

    public Double getPrecion() {
        return Precion;
    }
}
