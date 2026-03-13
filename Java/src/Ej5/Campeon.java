package Ej5;

public class Campeon {

    String nombre;
    String rolPrincipal;
    int dificultad;
    String recurso;
    int vidaMaxima;
    int danoAtaque;
    int poderHabilidad;
    int armadura;
    int resistenciaMagica;
    Habilidad pasiva;
    Habilidad q;
    Habilidad w;
    Habilidad e;
    Habilidad r;

    public Campeon(String nombre, String rolPrincipal, int dificultad, String recurso, int vidaMaxima,
                   int danoAtaque, int poderHabilidad, int armadura, int resistenciaMagica,
                   Habilidad pasiva, Habilidad q, Habilidad w, Habilidad e, Habilidad r) {

        this.nombre = nombre;
        this.rolPrincipal = rolPrincipal;
        this.dificultad = dificultad;
        this.recurso = recurso;
        this.vidaMaxima = vidaMaxima;
        this.danoAtaque = danoAtaque;
        this.poderHabilidad = poderHabilidad;
        this.armadura = armadura;
        this.resistenciaMagica = resistenciaMagica;
        this.pasiva = pasiva;
        this.q = q;
        this.w = w;
        this.e = e;
        this.r = r;
    }

    public static void infoCampeon(Campeon c) {

        System.out.println("=== " + c.nombre + " ===");
        System.out.println("Rol: " + c.rolPrincipal);
        System.out.println("Dificultad: " + c.dificultad + "/10");
        System.out.println("Recurso: " + c.recurso);
        System.out.println("Vida máxima: " + c.vidaMaxima);
        System.out.println("Daño de ataque: " + c.danoAtaque);
        System.out.println("Poder de habilidad: " + c.poderHabilidad);
        System.out.println("Armadura: " + c.armadura);
        System.out.println("Resistencia mágica: " + c.resistenciaMagica);
    }

    public static void infoHabilidades(Campeon c) {

        System.out.println("=== Habilidades de " + c.nombre + " ===");
        Habilidad.infoHabilidad(c.pasiva);
        Habilidad.infoHabilidad(c.q);
        Habilidad.infoHabilidad(c.w);
        Habilidad.infoHabilidad(c.e);
        Habilidad.infoHabilidad(c.r);
    }
}