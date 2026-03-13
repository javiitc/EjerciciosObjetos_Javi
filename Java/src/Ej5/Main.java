package Ej5;

public class Main {
    public static void main(String[] args) {

        Habilidad pasiva = new Habilidad("Pasiva", "Mil Cortes",
                "Los ataques básicos de Gwen infligen daño mágico adicional basado en un porcentaje de la vida máxima del objetivo.", 0, 0, 1);

        Habilidad q = new Habilidad("Q", "¡Corta que Corta!",
                "Gwen tijerea en una dirección de 2 a 6 veces causando daño mágico. El centro inflige daño verdadero y aplica efectos de golpe.", 40, 5, 1);

        Habilidad w = new Habilidad("W", "Niebla Sagrada",
                "Gwen invoca una niebla que la protege. Los enemigos fuera de ella no pueden seleccionarla con habilidades ni objetos.", 0, 22, 1);

        Habilidad e = new Habilidad("E", "Salto y Tajo",
                "Gwen se lanza una corta distancia y potencia sus ataques con mayor alcance, velocidad y daño mágico durante unos segundos.", 35, 13, 1);

        Habilidad r = new Habilidad("R", "Costura Cruel",
                "Gwen lanza agujas en línea que ralentizan y dañan a los enemigos. Puede usarse hasta 3 veces, cada vez lanzando más agujas.", 100, 120, 1);

        Campeon gwen = new Campeon("Gwen", "Luchadora", 7, "Maná",
                600, 55, 0, 38, 32,
                pasiva, q, w, e, r);

        Campeon.infoCampeon(gwen);
        System.out.println();
        Campeon.infoHabilidades(gwen);
    }
}