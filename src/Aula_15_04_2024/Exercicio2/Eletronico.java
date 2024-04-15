package Aula_15_04_2024.Exercicio2;

public class Eletronico extends Produto implements Desconto{

    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void desconto() {
        preco = (preco * 10 / 100);
    }
}

