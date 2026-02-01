import Model.Estudante;
import Model.Pessoa;
import Model.Profissional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Main{
    public static void main(String[] args) {
        Pessoa person = new Pessoa("Gabriel",21,"Masculino");
        Estudante estudant = new Estudante("Lucas ",18,"Masculino","ADS",1);
        Profissional profissional =  new Profissional("Daniel",24,"Masculino","Analista","ADS-UNICESUMAR");

        ArrayList<Pessoa> listPerson = new ArrayList<>();

        listPerson.add(person);
        listPerson.add(estudant);
        listPerson.add(profissional);


        //imprimindo pessoa mais nova
//        System.out.println("Lista Ordenada do mais novo pro mais velho");
//        Collections.sort(listPerson);
//        System.out.println(listPerson);
//
//        System.out.println("\nLista Ordenada por ordem alfabética");
//        listPerson.sort(Comparator.comparing(Pessoa::getNome));
//        System.out.println(listPerson);


        ArrayList<Integer> listNumbers = new ArrayList<>();

        listNumbers.add(10);
        listNumbers.add(1124);
        listNumbers.add(5);
        listNumbers.add(12313);

        Collections.sort(listNumbers);
        System.out.println(listNumbers);

        Collections.sort(listNumbers, Collections.reverseOrder());
        System.out.println(listNumbers);


//        System.out.println("Pessoas adicionadas na lista: ");
//        listPerson.forEach(people -> {
//            System.out.println(people.getNome());
//            if(people instanceof Estudante){
//                System.out.println("O documento é: " + estudant.getDocumento());
//            }else{
//                System.out.println("O documento é: " + profissional.getDocumento());
//            }
//        });

    }
}