package Visitor;

public class Eletronico implements Produto {

    private double preco;

    public Eletronico(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitarEletronico(this);
    }
}
