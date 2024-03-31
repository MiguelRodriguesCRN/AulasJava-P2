package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicio_Construtores_NotaDeAula04.Questão04;

public class Arara extends Animal{
    private int qtdOvos;

    public int getQtdOvos() {
        return qtdOvos;
    }

    public void setQtdOvos(int qtdOvos) {
        this.qtdOvos = qtdOvos;
    }

    public Arara(String classe, String locomocao, int qtdOvos) {
        super(classe, locomocao);
        this.qtdOvos = qtdOvos;
    }


}
