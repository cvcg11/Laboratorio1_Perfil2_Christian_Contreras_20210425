package org.example;

import java.util.LinkedList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Productos> base = new LinkedList<>();
        base.add(new Productos(1, "Pañales", 14.50));
        base.add(new Productos(1, "Jamon", 14.50));
        base.add(new Productos(1, "Manzanas", 14.50));
        base.add(new Productos(1, "Shampoo", 14.50));


        try {
            do {
                System.out.print(" -- BIENVENIDO --");
                System.out.println("\n Escoja una de la opciones");
                System.out.println("[1]. Crear un producto");
                System.out.println("[2]. Ver lista de productos un producto");
                System.out.println("[3]. Actualizar un producto");
                System.out.println("[4]. Eliminar un producto");

                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Hoka");
                        break;
                    case 2:

                        System.out.println("Hdsoka");
                        break;

                    case 3:

                        System.out.println("Hosdsdka");
                        break;

                    case 4:

                        System.out.println("Hoksdsdsda");
                        break;

                    case 5:
                        break;
                    default:
                }


            }
            while (){

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}