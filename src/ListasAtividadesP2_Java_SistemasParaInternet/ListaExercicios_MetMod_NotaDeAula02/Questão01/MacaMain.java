package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicios_MetMod_NotaDeAula02.Questão01;

import java.util.Scanner;

public class MacaMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Maca m = new Maca();

        System.out.println("Digite a Quantidade de maças que deseja comprar: ");
        m.setQtd(sc.nextInt());

        m.selecao();
        m.total();






    }
}