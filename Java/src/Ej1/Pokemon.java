package Ej1;

public class Pokemon {

    String nombrePokemon;
    String tipoPokemon;
    int generacion;
    boolean capturado;
    int numPokedex;
    String evolucionPrevia;

    public Pokemon(String nombrePokemon, String tipoPokemon, int generacion, boolean capturado, int numPokedex, String evolucionPrevia) {
        this.nombrePokemon = nombrePokemon;
        this.tipoPokemon = tipoPokemon;
        this.generacion = generacion;
        this.capturado = capturado;
        this.numPokedex = numPokedex;
        this.evolucionPrevia = evolucionPrevia;
    }

    public void infoPokemon () {
        System.out.println(nombrePokemon);
        System.out.println(tipoPokemon);
        System.out.println("Generación: " + generacion);
        System.out.println("Capturado? " + capturado);
        System.out.println("Numero Pokedex Nacional: " + numPokedex);
        System.out.println(evolucionPrevia);
    }

    public static void consultarPokemon (int eleccion, Pokemon pk1, Pokemon pk2, Pokemon pk3, Pokemon pk4, Pokemon pk5, Pokemon pk6) {
        switch (eleccion) {
            case 1:
                pk1.infoPokemon();
                break;
            case 2:
                pk2.infoPokemon();
                break;
            case 3:
                pk3.infoPokemon();
                break;
            case 4:
                pk4.infoPokemon();
                break;
            case 5:
                pk5.infoPokemon();
                break;
            case 6:
                pk6.infoPokemon();
                break;
        }
    }
}
