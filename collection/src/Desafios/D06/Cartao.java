package Desafios.D06;

public class Cartao {

    private double limiteDoCartao;

    public Cartao(double limiteDoCartao) {
        this.limiteDoCartao = limiteDoCartao;
    }

    public double getLimiteDoCartao() {
        return limiteDoCartao;
    }

    public void addSaldo(double valor){
        this.limiteDoCartao += valor;
    }


    public boolean comprar(Product product){
        if(product.getPreco() <= getLimiteDoCartao()){
            this.limiteDoCartao -= product.getPreco();
            return true;
        }else{
           return false;
        }
    }

}
