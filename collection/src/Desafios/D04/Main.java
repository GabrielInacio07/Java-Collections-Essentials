package Desafios.D04;

import java.util.ArrayList;
import java.util.Objects;

public class Main {

    static void main(String[] args) {

        ContaBancaria cont = new ContaBancaria(123,205);
        ContaBancaria cont2 = new ContaBancaria(456,590);
        ContaBancaria cont3 = new ContaBancaria(789,100);

        ArrayList<ContaBancaria> listCont = new ArrayList<>();


        listCont.add(cont);
        listCont.add(null);
        listCont.add(null);

        //Modificação para evitar NullPointerException ;D
        double maiorSaldo = 0;
        int posicao = 0;

        for (ContaBancaria item : listCont) {
            if(item != null && item.getSaldo() > maiorSaldo){
                posicao++;
                maiorSaldo = item.getSaldo();
            }else if (Objects.isNull(item)){
                posicao++;
                System.out.println(posicao + "º Item da lista vazio");
            }
        }

        System.out.println("Maior saldo: " + maiorSaldo);

    }
}
