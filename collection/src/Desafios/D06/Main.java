package Desafios.D06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cartao cartao = new Cartao(1200);
        ArrayList<Product> listProduct = new ArrayList<>();


        int inicializador = -1;

        while (inicializador != 0) {

            System.out.println("Digite a opção desejada:");
            System.out.println("Opção 1 - Adicionar produto a compra");
            System.out.println("Opção 2 - Adicionar saldo no limite do Cartão");
            System.out.println("Opção 3 - Consultar o Limite do Cartão");
            System.out.println("Opção 0 - Sair da compra");

            int opcao = Integer.parseInt(input.nextLine());

            if (opcao == 1) {
                System.out.println("Digite o nome do produto:");
                String nome = input.nextLine();

                System.out.println("Digite o preço do produto:");
                double preco = Double.parseDouble(input.nextLine());
                Product product = new Product(nome, preco);

                if (cartao.comprar(product)) {
                    System.out.println("Produto adicionado ;D");
                    listProduct.add(product);
                } else {
                    System.out.println("Não possui saldo suficiente");
                }

            } else if (opcao == 2) {
                System.out.println("Digite o valor: ");
                double valor = Double.parseDouble((input.nextLine()));
                cartao.addSaldo(valor);
            } else if (opcao == 3) {
                System.out.println("Limite do cartão: " + cartao.getLimiteDoCartao());
            } else if (opcao == 0) {
                break;
            }
        }
        Collections.sort(listProduct);

        System.out.println("LISTA DE PRODUTOS (Do mais caro ao menos)");

        for (Product item : listProduct) {
            System.out.println(item);
        }

    }
}
