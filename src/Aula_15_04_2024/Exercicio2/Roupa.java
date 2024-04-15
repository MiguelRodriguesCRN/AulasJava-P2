package Aula_15_04_2024.Exercicio2;

public class Roupa extends Produto implements Desconto{
    public Roupa(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void desconto() {

    }
}
