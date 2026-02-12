package Ej2;

import java.util.Scanner;

public class Cartas {

    String nombre;
    int costeMana;
    String imagen;
    String tipoCarta;
    String habilidad;
    String rareza;
    String subtipoCarta;
    String artista;
    int fuerza;
    int resistencia;

    public Cartas(String nombre, int costeMana, String imagen, String tipoCarta, String habilidad, String rareza, String subtipoCarta, String artista, int fuerza, int resistencia) {
        this.nombre = nombre;
        this.costeMana = costeMana;
        this.imagen = imagen;
        this.tipoCarta = tipoCarta;
        this.habilidad = habilidad;
        this.rareza = rareza;
        this.subtipoCarta = subtipoCarta;
        this.artista = artista;
        this.fuerza = fuerza;
        this.resistencia = resistencia;
    }

    public Cartas () { // Constructor vacío para poder registrar una carta
    }


    public static void infoCarta (Cartas c1){
        System.out.println("Nombre: " + c1.nombre);
        System.out.println("Coste de maná: " + c1.costeMana);
        System.out.println("Tipo: " + c1.tipoCarta);
        System.out.println("Habilidad: "+ c1.habilidad);
        System.out.println("Rareza: " + c1.rareza);
        System.out.println("Subtipo: " + c1.subtipoCarta);
        System.out.println("Artista: " + c1.artista);
        System.out.println("Fuerza: " + c1.fuerza + " || Resistencia: " + c1.resistencia);

    }

    public static void registrarCarta(Cartas c2, Scanner sc){

        System.out.println("Para registrar una carta deberás rellenar todos los datos necesarios (menos la imagen)");

        System.out.println("Nombre: ");
        c2.nombre = sc.nextLine();

        System.out.println("Coste: ");
        c2.costeMana = sc.nextInt();

        System.out.println("Tipo: ");
        c2.tipoCarta = sc.nextLine();

        System.out.println("Habilidad: ");
        c2.habilidad = sc.nextLine();

        System.out.println("Rareza: ");
        c2.rareza = sc.nextLine();

        System.out.println("Subtipo: ");
        c2.subtipoCarta = sc.nextLine();

        System.out.println("Artista: ");
        c2.artista = sc.nextLine();

        System.out.println("Fuerza: ");
        c2.fuerza = sc.nextInt();
        System.out.println("Resistencia: ");
        c2.resistencia = sc.nextInt();

        System.out.println("Tu carta ha sido registrada correctamente!");
    }

    public static void mostrarCartaRegistrada(Cartas c2){

        System.out.println("Nombre: " + c2.nombre);
        System.out.println("Coste: " + c2.costeMana);
        System.out.println("Tipo: " + c2.tipoCarta);
        System.out.println("Habilidad: " + c2.habilidad);
        System.out.println("Rareza: " + c2.rareza);
        System.out.println("Subtipo: " + c2.subtipoCarta);
        System.out.println("Artista: " + c2.artista);
        System.out.println("Fuerza: " + c2.fuerza + " || Resistencia: " + c2.resistencia);

    }
}
