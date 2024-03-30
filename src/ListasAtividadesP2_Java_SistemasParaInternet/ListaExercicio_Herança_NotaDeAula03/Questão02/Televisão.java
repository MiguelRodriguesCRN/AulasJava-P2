package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicio_Herança_NotaDeAula03.Questão02;

import javax.swing.plaf.PanelUI;
public class Televisão extends Produto{

    private int select_tv;

    public int getSelect_tv() {
        return select_tv;
    }

    public void setSelect_tv(int select_tv) {
        this.select_tv = select_tv;
    }

    public void acessarCanais() {

        switch (select_tv) {
            case 5:

                System.out.println("Acessando SBT...");
                break;

            case 7:
                System.out.println("Acessando TV GLOBO...");
                break;

            case 12:
                System.out.println("Acessando RECORD...");
                break;
        }


    }
}
