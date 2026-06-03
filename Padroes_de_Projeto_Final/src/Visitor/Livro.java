package Visitor;

public class Livro implements Produto {

    private double preco;

    public Livro(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitarLivro(this);
    }
}
