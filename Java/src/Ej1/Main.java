package Ej1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pokemon pk1 = new Pokemon("Snorlax", "Normal", 1, true, 143, "Munchlax");
        Pokemon pk2 = new Pokemon("Garchomp", "Dragon / Tierra", 4, true, 445, "Gabite");
        Pokemon pk3 = new Pokemon("Blaziken", "Fuego / Lucha", 3, true, 257, "Combusken");
        Pokemon pk4 = new Pokemon("Dusclops", "Fantasma", 3, true, 356, "Duskull");
        Pokemon pk5 = new Pokemon("Ferropaladín", "Hada / Lucha", 9, true, 1006, "No tiene evolución previa");
        Pokemon pk6 = new Pokemon("Greninja", "Agua / Siniestro", 6, true, 658, "Frogadier");

        System.out.println("Que pokemon de tu equipo quieres consultar en la pokedex?");
        int eleccion = sc.nextInt();

        Pokemon.consultarPokemon(eleccion, pk1, pk2, pk3, pk4, pk5, pk6);
    }
}
