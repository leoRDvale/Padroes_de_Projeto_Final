package Visitor;

public class Main {

    public static void main(String[] args) {

        Produto livro = new Livro(100);

        Produto notebook =
                new Eletronico(3000);

        Visitor imposto =
                new CalculadorImposto();

        livro.aceitar(imposto);
        notebook.aceitar(imposto);
    }
}
