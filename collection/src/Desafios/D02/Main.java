package Desafios.D02;

import java.util.ArrayList;

public class Main {

    static void main(String[] args) {
        Product product = new Product("Mouse sem fio",120);
        Product product2 = new Product("Teclado mecânico",250);
        Product product3 = new Product("Headset sem fio",495);

//        System.out.println(product3.toString());

        ArrayList<Product> listProduct = new ArrayList<>();

        listProduct.add(product);
        listProduct.add(product2);
        listProduct.add(product3);


        double precoTotal = 0;


        for (Product p : listProduct) {
            precoTotal += p.getPreco();
        }

        System.out.println("O preço total é: " + precoTotal);
        System.out.println(String.format("A média de preço dos produtos é: %.2f", precoTotal / listProduct.size()));
    }

}
