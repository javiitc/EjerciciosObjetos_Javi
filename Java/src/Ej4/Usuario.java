package Ej4;

import java.util.ArrayList;

public class Usuario {

    String nombreUsuario;
    String email;
    String tipoCuenta; // "gratuita" o "premium"
    String fechaRegistro;
    ArrayList<Cancion> playlist;

    public Usuario(String nombreUsuario, String email, String tipoCuenta, String fechaRegistro) {
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.tipoCuenta = tipoCuenta;
        this.fechaRegistro = fechaRegistro;
        this.playlist = new ArrayList<Cancion>();
    }

    public static void agregarCancion(Usuario u, Cancion c) {
        u.playlist.add(c);
        System.out.println("Canción \"" + c.titulo + "\" añadida a la playlist de " + u.nombreUsuario);
    }

    public static void mostrarPlaylist(Usuario u) {
        System.out.println("--- Playlist de " + u.nombreUsuario + " ---");
        if (u.playlist.isEmpty()) {
            System.out.println("La playlist está vacía.");
        } else {
            for (int i = 0; i < u.playlist.size(); i++) {
                System.out.println("\n[" + (i + 1) + "]");
                Cancion.infoCancion(u.playlist.get(i));
            }
        }
    }

    public static void infoUsuario(Usuario u) {
        System.out.println("Usuario: " + u.nombreUsuario);
        System.out.println("Correo: " + u.email);
        System.out.println("Tipo de cuenta: " + u.tipoCuenta);
        System.out.println("Fecha de registro: " + u.fechaRegistro);
        System.out.println("Canciones en playlist: " + u.playlist.size());
    }
}