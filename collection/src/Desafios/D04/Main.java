package Desafios.D04;

import java.util.ArrayList;

public class Main {

    static void main(String[] args) {

        ContaBancaria cont = new ContaBancaria(123,205);
        ContaBancaria cont2 = new ContaBancaria(456,590);
        ContaBancaria cont3 = new ContaBancaria(789,100);

        ArrayList<ContaBancaria> listCont = new ArrayList<>();

        listCont.add(cont);
        listCont.add(cont2);
        listCont.add(cont3);

        double maiorSaldo = listCont.get(0).getSaldo();

        for (ContaBancaria item : listCont) {
            if (item.getSaldo() > maiorSaldo) {
                maiorSaldo = item.getSaldo();
            }
        }

        System.out.println("Maior saldo: " + maiorSaldo);

    }
}
