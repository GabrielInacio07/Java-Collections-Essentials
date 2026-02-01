package Model;

public class Estudante extends Pessoa implements Documents {

    private String curso;
    private int termo;

    public Estudante(String nome, int idade, String genero, String curso, int termo) {
        super(nome, idade, genero);
        this.curso = curso;
        this.termo = termo;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Curso: " + curso +
                " Termo: " + termo;
    }

    @Override
    public String getDocumento(){
        return "Carteira de Estudante";
    }
}
