package Desafios.D01;

public class Cachorro extends Animal{

    public Cachorro(String raca, String nome){
        super(raca,nome);
    }

    public void fazerBarulho(){
        System.out.println(this.getNome() + " está latindo");
    }
}
