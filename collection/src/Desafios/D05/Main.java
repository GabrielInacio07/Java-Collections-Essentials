package Desafios.D05;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static void main(String[] args) {
        Title titulo = new Title("ZEBRA");
        Title titulo2 = new Title("SKYRIM");

        ArrayList<Title> listTtile = new ArrayList<>();

        listTtile.add(titulo);
        listTtile.add(titulo2);

        Collections.sort(listTtile);
        System.out.println(listTtile);

        for (Title item : listTtile){
            System.out.println(item.getNome());
        }
    }
}
