package org.example;

import java.util.UUID;

public class Productos {
    int id;
    String Nombre;
    Double Precio;

    public Productos(int id, String nombre, Double precio) {
        this.id = id;
        Nombre = nombre;
        Precio = precio;
    }
    

    @Override
    public String toString() {
        return "id: " + id + ", Nombre: " + Nombre + ", Precio: " + Precio;
    }
}


