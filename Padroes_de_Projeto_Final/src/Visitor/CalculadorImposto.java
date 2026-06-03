package Visitor;

public class CalculadorImposto implements Visitor {

    @Override
    public void visitarLivro(Livro livro) {

        double imposto =
                livro.getPreco() * 0.10;

        System.out.println("Imposto Sobre Livros: R$ "
                + imposto);
    }

    @Override
    public void visitarEletronico(Eletronico eletronico) {

        double imposto =
                eletronico.getPreco() * 0.25;

        System.out.println("Imposto Sobre Eletrônicos: R$ "
                + imposto);
    }
}