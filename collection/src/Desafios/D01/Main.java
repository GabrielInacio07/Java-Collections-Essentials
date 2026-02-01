package Desafios.D01;

import java.util.ArrayList;

public class Main {

    static void main(String[] args) {

        ArrayList<Animal> listAnimals = new ArrayList<>();
        ArrayList<String> listString = new ArrayList<>();

        listString.add("Maça");
        listString.add("Banana");

        Animal animals = new Animal("Réptil", "CROCODILE");
        Animal dog = new Cachorro("Pastor Alemão", "DOUG");

        listAnimals.add(animals);
        listAnimals.add(dog);


        listAnimals.forEach(animal -> {
            if (animal instanceof Cachorro) {
                ((Cachorro) animal).fazerBarulho();
            }
        });

    }
}
