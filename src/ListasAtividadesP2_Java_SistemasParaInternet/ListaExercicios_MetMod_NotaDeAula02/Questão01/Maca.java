package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicios_MetMod_NotaDeAula02.Questão01;

import java.util.Scanner;

public class Maca {

    private double preco = 1.30;
    private double qtd;
    public double total;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQtd() {
        return qtd;
    }

    public void setQtd(double qtd) {
        this.qtd = qtd;
    }

    public void selecao() {

        if (qtd >= 12) {
            preco = 1.00;
        }
    }

    public void total() {

        total = qtd * preco;
        System.out.println("O total da compra: "+total);

    }
}
