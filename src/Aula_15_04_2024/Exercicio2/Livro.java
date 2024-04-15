package Aula_15_04_2024.Exercicio2;

public class Livro extends Produto implements Desconto{
    public Livro(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void desconto() {
        preco = (preco * 10 / 100);
    }
}
