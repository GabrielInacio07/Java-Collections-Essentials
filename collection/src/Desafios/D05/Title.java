package Desafios.D05;

public class Title implements Comparable<Title> {

    private String nome;

    public Title(String nome){this.nome = nome;}

    public String getNome(){
        return this.nome;
    }

    @Override
    public String toString() {
        return "Title{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public int compareTo(Title titleComparado) {
        return this.nome.compareTo(titleComparado.getNome());
    }
}
