package Desafios.D06;

public class Product implements Comparable<Product>{

    private String nome;
    private double preco;

    public Product(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void showProduct(){
        System.out.println("Produto: " + getNome() + "\nPreço: " + getPreco());
    }

    @Override
    public String toString() {
        return "Product{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public int compareTo(Product precoComparado) {
        return Double.compare(precoComparado.getPreco(),this.preco);
    }
}
