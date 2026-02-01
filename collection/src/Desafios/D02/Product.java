package Desafios.D02;

public class Product {

    private String nome;
    private double preco;

    public Product(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
