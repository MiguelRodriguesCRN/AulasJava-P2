package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicio_Construtores_NotaDeAula04.Questão04;

public class Animal {
    protected String classe, locomocao;

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getLocomocao() {
        return locomocao;
    }

    public void setLocomocao(String locomocao) {
        this.locomocao = locomocao;
    }

    public Animal(String classe, String locomocao) {
        super();
        this.classe = classe;
        this.locomocao = locomocao;
    }
}
