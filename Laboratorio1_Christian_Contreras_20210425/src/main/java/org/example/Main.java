package org.example;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Productos> base = new LinkedList<>();
        base.add(new Productos(1, "Pañales", 14.50));
        base.add(new Productos(2, "Jamon", 14.50));
        base.add(new Productos(3, "Manzanas", 14.50));
        base.add(new Productos(4, "Shampoo", 14.50));
        int nextId = 5;

        try {
            boolean salir = false;
            do {
                System.out.print(" -- BIENVENIDO --");
                System.out.println("\n Escoja una de las opciones");
                System.out.println("[1]. Crear un producto");
                System.out.println("[2]. Ver lista de productos");
                System.out.println("[3]. Actualizar un producto");
                System.out.println("[4]. Eliminar un producto");
                System.out.println("[5]. Salir");

                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        boolean CrearNuevo = true;
                        while (CrearNuevo){
                            System.out.println("Introduzca nombre del producto:");
                            String nombre = scanner.nextLine();

                            System.out.println("Introduzca el precio del producto:");
                            double precio = scanner.nextDouble();
                            scanner.nextLine();

                            Productos nuevo = new Productos(nextId, nombre, precio);
                            base.add(nuevo);
                            nextId++;

                            System.out.println("El producto ha sido agregado exitosamente");

                            System.out.println("\n¿Desea crear otro producto? (S/N)");
                            String respuesta = scanner.nextLine().trim().toUpperCase();

                            if (!respuesta.equals("S")) {
                                CrearNuevo = false;
                            }
                        }
                        break;
                    case 2:
                        boolean VerLista = true;
                        while (VerLista){
                            System.out.println("Lista de productos");
                            for (Productos elemento : base) {
                                System.out.println(elemento);
                            }
                            System.out.println("\nPresione (N) para salir o cualquier otra tecla");
                            String respuesta = scanner.nextLine().trim().toUpperCase();

                            if (respuesta.equals("N")) {
                                VerLista = false;
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Funcionalidad para actualizar");
                        break;
                    case 4:
                        System.out.println("Funcionalidad para eliminar");
                        break;
                    case 5:
                        salir = true;
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } while (!salir);
        } catch (Exception e) {
            System.out.println("Caracter incorrecto");
        }


    }





}