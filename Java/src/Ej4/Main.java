package Ej4;

public class Main {
    public static void main(String[] args) {

        Cancion c1 = new Cancion("POR SI MAÑANA NO ESTOY", "Omar Courtz", "POR SI MAÑANA NO ESTOY ", 240, "Urbano", 4500000);
        Cancion c2 = new Cancion("Not Like Us", "Kendrick Lamar", " Single", 240, "Rap", 3200000);
        Cancion c3 = new Cancion("FUNERAL", "Alvaro Díaz & Aron Piper", "SAYONARA", 150, "Urbano", 2800000);
        Cancion c4 = new Cancion("MERCEDES CAROTA", "Bad Bunny & YVNGCHIMI", "NADIE SABE LO QUE VA A PASAR MAÑANA ", 194, "Urbano", 16392111);
        Cancion c5 = new Cancion("EL PADRINO", "Feid", "INTER SHIBUYA", 130, "Urbano", 13890222);

        Usuario u1 = new Usuario("javi99", "javi@correo.com", "premium", "13/03/2026");

        System.out.println("=== Información del usuario ===");
        Usuario.infoUsuario(u1);

        System.out.println("\n=== Añadiendo canciones a la playlist ===");
        Usuario.agregarCancion(u1, c1);
        Usuario.agregarCancion(u1, c2);
        Usuario.agregarCancion(u1, c3);
        Usuario.agregarCancion(u1, c4);
        Usuario.agregarCancion(u1, c5);

        System.out.println("\n=== Playlist completa ===");
        Usuario.mostrarPlaylist(u1);
    }
}