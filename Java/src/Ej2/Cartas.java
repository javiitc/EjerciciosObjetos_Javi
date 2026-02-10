package Ej2;

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
}
