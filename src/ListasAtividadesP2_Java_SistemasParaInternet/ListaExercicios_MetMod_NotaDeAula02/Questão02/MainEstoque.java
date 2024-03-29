package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicios_MetMod_NotaDeAula02.Questão02;
import java.util.Scanner;
public class MainEstoque {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Estoque es = new Estoque();

        System.out.println("Digite o estoque atual: ");
        es.setQtd_atual(sc.nextInt());
        System.out.println("Digite o estoque Maximo: ");
        es.setQtd_max(sc.nextInt());
        System.out.println("Digite o estoque minimo: ");
        es.setQtd_min(sc.nextInt());

        es.compra();
        es.media();




    }
}
