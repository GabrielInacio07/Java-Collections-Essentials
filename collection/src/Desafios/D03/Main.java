package Desafios.D03;

import java.util.ArrayList;

public class Main {

    static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        Circulo circle = new Circulo(8);

        ArrayList<Forma> listArea = new ArrayList<>();

        listArea.add(quadrado);
        listArea.add(circle);

        for (Forma forma : listArea) {
            System.out.printf("Área do %s: %.2f%n", forma.getNome(), forma.calcularArea());
        }
    }
}
