package Ej5;

public class Habilidad {

    String tecla;
    String nombre;
    String descripcion;
    int costeRecurso;
    double enfriamiento; // en segundos
    int nivel;

    public Habilidad(String tecla, String nombre, String descripcion, int costeRecurso, double enfriamiento, int nivel) {

        this.tecla = tecla;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costeRecurso = costeRecurso;
        this.enfriamiento = enfriamiento;
        this.nivel = nivel;
    }

    public static void infoHabilidad(Habilidad h) {

        System.out.println("[" + h.tecla + "] " + h.nombre + " Nivel " + h.nivel);
        System.out.println("Descripción: " + h.descripcion);
        System.out.println("Coste: " + h.costeRecurso + " || Enfriamiento: " + h.enfriamiento + "s");
    }
}