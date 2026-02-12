package Ej3;

import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Paciente p1 = new Paciente();
        Scanner sc = new Scanner(System.in);

        Paciente.registrarPaciente(sc, p1);

        Paciente.calcularIMC(p1);
    }
}
