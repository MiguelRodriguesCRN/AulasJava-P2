package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicio_Herança_NotaDeAula03.Questão01;

public class Diretor extends Funcionario {
    private int acoes;

    public int getAcoes() {
        return acoes;
    }
    public void setAcoes(int acoes) {
        this.acoes = acoes;
    }

    public void exibirAcoes() {
        super.exibir();
        System.out.println("___________");
        System.out.println("SEÇÃO DIRETOR:");
        System.out.println("Quantidade Ações: "+acoes);
    }
}
