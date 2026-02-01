package Model;

public class Profissional extends Pessoa implements Documents {

    private String profissao;
    private String graduacao;

    public Profissional(String nome, int idade, String genero, String profissao, String graduacao) {
        super(nome, idade, genero);
        this.profissao = profissao;
        this.graduacao = graduacao;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Profissão: " + profissao +
                " Graduação: " + graduacao;
    }

    @Override
    public String getDocumento(){
        return "Carteira de Trabalho";
    }
}
