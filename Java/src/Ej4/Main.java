package Ej4;

public class Main {
    public static void main(String[] args) {

        // Crear canciones
        Cancion c1 = new Cancion("Blinding Lights", "The Weeknd", "After Hours", 200, "Pop", 4500000);
        Cancion c2 = new Cancion("HUMBLE.", "Kendrick Lamar", "DAMN.", 177, "Hip-Hop", 3200000);
        Cancion c3 = new Cancion("Bohemian Rhapsody", "Queen", "A Night at the Opera", 354, "Rock", 2800000);
        Cancion c4 = new Cancion("Bad Guy", "Billie Eilish", "When We All Fall Asleep", 194, "Pop", 3900000);

        // Crear usuario
        Usuario u1 = new Usuario("javi99", "javi@correo.com", "premium", "13/03/2026");

        // Mostrar info del usuario
        System.out.println("=== Información del usuario ===");
        Usuario.infoUsuario(u1);

        // Añadir canciones a la playlist
        System.out.println("\n=== Añadiendo canciones a la playlist ===");
        Usuario.añadirCancion(u1, c1);
        Usuario.añadirCancion(u1, c2);
        Usuario.añadirCancion(u1, c3);
        Usuario.añadirCancion(u1, c4);

        // Mostrar playlist completa
        System.out.println("\n=== Playlist completa ===");
        Usuario.mostrarPlaylist(u1);
    }
}