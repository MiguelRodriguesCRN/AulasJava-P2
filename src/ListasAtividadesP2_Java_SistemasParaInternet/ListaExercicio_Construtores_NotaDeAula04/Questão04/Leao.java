package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicio_Construtores_NotaDeAula04.Questão04;

public class Leao extends Animal{
    private String pelo;

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public Leao(String classe, String locomocao, String pelo) {
        super(classe, locomocao);
        this.pelo = pelo;
    }
}
