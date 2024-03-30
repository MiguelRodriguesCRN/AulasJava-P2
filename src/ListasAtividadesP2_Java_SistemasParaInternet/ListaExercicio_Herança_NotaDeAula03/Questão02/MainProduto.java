package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicio_Herança_NotaDeAula03.Questão02;
import java.util.Scanner;

public class MainProduto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto pd = new Produto();
        Televisão tv = new Televisão();
        Smartphone cell = new Smartphone();

        System.out.println("Deseja Cadastrar Produto ou Vender Produto? [1 = Cadastrar] [2 = Vender]");
        pd.setSelect_geral(sc.nextInt());
        switch (pd.getSelect_geral()) {

            case 1:
                System.out.println("Qual produto deseja Cadastrar? [1 = Smartphone] [2 = Tv]");
                pd.setSelect_cadastro(sc.nextInt());

                pd.Cadastro();

                System.out.println("Deseja cadastrar mais algum produto? [1 = SIM] [2 = NÃO]");
                pd.setSelect_geral(sc.nextInt());

                pd.exibirEstoque();
                break;

            case 2:
                System.out.println("Qual produto deseja Vender? [1 = Smartphone] [2 = Tv]");
                pd.setSelect_venda(sc.nextInt());

                pd.Venda();

                pd.exibirEstoque();
                break;
        }

        System.out.println("Deseja Utilizar a TV OU O CELL [1 = TV] [2 = CELL]");
        pd.setSelect_acao(sc.nextInt());
        switch (pd.getSelect_acao()) {

            case 1:
                System.out.println("Digite o Canal que deseja Acessar: [5 = SBT] [7 = TV GLOBO] [12 = RECORD]");
                tv.setSelect_tv(sc.nextInt());

                tv.acessarCanais();
                break;

            case 2:
                System.out.println("Digite o número que deseja ligar: ");
                cell.setSelect_num(sc.nextInt());

                cell.ligacao();
                break;
        }
    }
}