package Ej4;

public class Cancion {

    String titulo;
    String artista;
    String album;
    int duracion; // en segundos
    String genero;
    int numReproducciones;

    public Cancion(String titulo, String artista, String album, int duracion, String genero, int numReproducciones) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.duracion = duracion;
        this.genero = genero;
        this.numReproducciones = numReproducciones;
    }

    public static void infoCancion(Cancion c) {
        int minutos = c.duracion / 60;
        int segundos = c.duracion % 60;
        System.out.println("Título: " + c.titulo);
        System.out.println("Artista: " + c.artista);
        System.out.println("Álbum: " + c.album);
        System.out.println("Duración: " + minutos + ":" + String.format("%02d", segundos));
        System.out.println("Género: " + c.genero);
        System.out.println("Reproducciones: " + c.numReproducciones);
    }
}
