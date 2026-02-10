package Ej2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cartas c1 = new Cartas("Creador pétreo", 3, "", "Criatura",
                "Unir Almas", "?", "Chamán humano", "Wesley Burt",
                1, 1);

        Cartas.infoCarta(c1);
    }
}
