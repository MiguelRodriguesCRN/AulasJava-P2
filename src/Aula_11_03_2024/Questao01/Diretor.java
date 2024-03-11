package Aula_11_03_2024.Questao01;

public class Diretor extends Funcionario{

    private int acoes;

    public int getAcoes() {
        return acoes;
    }

    public void setAcoes(int acoes) {
        this.acoes = acoes;
    }

    public void ExibirAcao() {
        super.exibir();
        System.out.println("Quantidade de Ações: " + acoes);
    }
}
