package ListaExercicios_MetMod_NotaDeAula02.Questão02;

public class Estoque {

    private int qtd_atual, qtd_max, qtd_min, qtd_media;

    public int getQtd_atual() {
        return qtd_atual;
    }

    public void setQtd_atual(int qtd_atual) {
        this.qtd_atual = qtd_atual;
    }

    public int getQtd_max() {
        return qtd_max;
    }

    public void setQtd_max(int qtd_max) {
        this.qtd_max = qtd_max;
    }

    public int getQtd_min() {
        return qtd_min;
    }

    public void setQtd_min(int qtd_min) {
        this.qtd_min = qtd_min;
    }

    public void media() {
        qtd_media = (qtd_max + qtd_min) / 2;
        System.out.println(qtd_media);

    }

    public void compra() {

        if (qtd_atual >= qtd_media) {
            System.out.println("Efetuar Compra");
        } else {
            System.out.println("Não Efetuar Compra");
        }
    }

}
