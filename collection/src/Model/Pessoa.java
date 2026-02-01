package Model;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private int idade;
    private String genero;


    public Pessoa(String nome, int idade, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }


    public void showPerson() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Gênero: " + genero);
    }

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }


    @Override
    public String toString() {
        return "\nPessoa: " + nome + " Idade: " + idade + " Gênero: " + genero + " ";
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        return Integer.compare(this.idade, outraPessoa.idade);
    }
}
