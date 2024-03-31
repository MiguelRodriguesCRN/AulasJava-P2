package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicio_Construtores_NotaDeAula04.Questão02;

public class Produto {
    private String nome, carac;
    private double preco;

    public Produto(String nome, String carac, double preco){
        this.nome = nome;
        this.carac = carac;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCarac() {
        return carac;
    }

    public void setCarac(String carac) {
        this.carac = carac;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
