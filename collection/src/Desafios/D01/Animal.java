package Desafios.D01;

public class Animal {

    private String raca;
    private String nome;

    public Animal(String raca, String nome){
        this.raca = raca;
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}
