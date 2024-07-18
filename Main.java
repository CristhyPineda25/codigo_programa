/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareamodulo6;

/**
 *
 * @author pined
 */
public class Main {
    public static void main(String[] args) {
        // Crear 5 instancias de Doctor
        Doctor doctor1 = new Doctor("Dr. Juan Perez", 45, "Cardiologia");
        Doctor doctor2 = new Doctor("Dr. Ana Fernandez", 38, "Neurologia");
        Doctor doctor3 = new Doctor("Dr. Pedro Guzman", 50, "Pediatria");
        Doctor doctor4 = new Doctor("Dr. Laura Laros", 42, "Dermatologia");
        Doctor doctor5 = new Doctor("Dr. Miguel Sauseda", 35, "Ortopedia");

        // Crear 5 instancias de Deportista
        Deportista deportista1 = new Deportista("Carlos Zelaya", 25, "Futbol");
        Deportista deportista2 = new Deportista("Lucía hernandez", 22, "Natacion");
        Deportista deportista3 = new Deportista("Diego Enamorado", 30, "Atletismo");
        Deportista deportista4 = new Deportista("Maria Trinidad", 28, "Tenis");
        Deportista deportista5 = new Deportista("Pablo bustamante", 24, "Ciclismo");

        // Imprimir información de los doctores
        System.out.println("Doctores:");
        System.out.println(doctor1);
        System.out.println(doctor2);
        System.out.println(doctor3);
        System.out.println(doctor4);
        System.out.println(doctor5);

        // Imprimir información de los deportistas
        System.out.println("\nDeportistas:");
        System.out.println(deportista1);
        System.out.println(deportista2);
        System.out.println(deportista3);
        System.out.println(deportista4);
        System.out.println(deportista5);
    }
}
