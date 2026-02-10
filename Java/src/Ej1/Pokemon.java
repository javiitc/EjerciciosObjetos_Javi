package Ej1;

public class Pokemon {

    String nombrePokemon;
    String tipoPokemon;
    int generacion;
    boolean capturado;
    int numPokedex;

    public Pokemon(String nombrePokemon, String tipoPokemon, int generacion, boolean capturado, int numPokedex) {
        this.nombrePokemon = nombrePokemon;
        this.tipoPokemon = tipoPokemon;
        this.generacion = generacion;
        this.capturado = capturado;
        this.numPokedex = numPokedex;
    }
}
