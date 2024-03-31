package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicio_Construtores_NotaDeAula04.Questão02;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Camisa", "Camisa Azul", 50.00);
        Produto produto2 = new Produto("Calça", "Calça Preta", 150.00);

        System.out.println("Produto 1:"+produto1.getNome()+"|"+produto1.getCarac()+"|"+produto1.getPreco());
        System.out.println("Produto 1:"+produto2.getNome()+"|"+produto2.getCarac()+"|"+produto2.getPreco());
    }
}
