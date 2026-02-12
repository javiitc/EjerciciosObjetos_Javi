package Ej3;

import java.util.Scanner;

public class Paciente {

    String nombre;
    String apellido;
    String fechaNac;
    String dni;
    String sexo;
    int altura;
    int peso;
    String alergias;
    String medicacion;
    String enfermedades;
    String operaciones;
    Scanner sc;


    public Paciente() {
    }

    public Paciente(String nombre, String apellido, String fechaNac, String dni, String sexo, int altura, int peso, String alergias, String medicacion, String enfermedades, String operaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.dni = dni;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.alergias = alergias;
        this.medicacion = medicacion;
        this.enfermedades = enfermedades;
        this.operaciones = operaciones;
    }

    public static void registrarPaciente(Scanner sc, Paciente p1) {

        System.out.println("Para registrar al paciente primero rellena toda la información requerida");
        System.out.println("Nombre: ");
        p1.nombre = sc.next();

        System.out.println("Apellido: ");
        p1.apellido = sc.next();

        System.out.println("Fecha nacimiento: ");
        p1.fechaNac = sc.next();

        System.out.println("Dni: ");
        p1.dni = sc.next();

        System.out.println("Sexo (Solo masculino o femenino): ");
        p1.sexo = sc.next();

        System.out.println("Altura (en cm): ");
        p1.altura = sc.nextInt();

        System.out.println("Peso (en kg): ");
        p1.peso = sc.nextInt();

        System.out.print("Alergias conocidas? ");
        p1.alergias = sc.nextLine();

        System.out.println("El paciente toma alguna medicación? ");
        p1.medicacion = sc.nextLine();

        System.out.println("El paciente padece de alguna enfermedad crónica? ");
        p1.enfermedades = sc.nextLine();

        System.out.println("El paciente ha pasado por alguna operación? ");
        p1.operaciones = sc.nextLine();

        System.out.println("Paciente registrado correctamente");
    }

    public static void calcularIMC (Paciente p1){

        float alturaMetros = (float) p1.altura/100;
        float IMC = (float) (p1.peso/ (Math.pow(alturaMetros, 2)));
        System.out.println("El IMC del paciente " + p1.apellido + " es " + IMC );

    }
}
