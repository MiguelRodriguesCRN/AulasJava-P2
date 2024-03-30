package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicio_Herança_NotaDeAula03.Questão02;

public class Smartphone extends Produto{

    private int select_num;

    public int getSelect_num() {
        return select_num;
    }

    public void setSelect_num(int select_num) {
        this.select_num = select_num;
    }

    public void ligacao() {

        System.out.println("Ligando para o numero: "+select_num);
    }




}
