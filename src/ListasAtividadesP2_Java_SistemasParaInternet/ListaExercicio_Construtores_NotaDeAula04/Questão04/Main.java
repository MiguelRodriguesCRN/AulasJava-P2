package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicio_Construtores_NotaDeAula04.Questão04;

public class Main {
    public static void main(String[] args) {

        Leao leao = new Leao("Mamífero", "Patas", "Juba");
        Arara arara = new Arara("Psittacidae", "Asas", 4);

        System.out.println("Informações do Leao:");
        System.out.println(leao.getClasse());
        System.out.println(leao.getLocomocao());
        System.out.println(leao.getPelo());


        System.out.println("Informações da Arara:");
        System.out.println(arara.getClasse());
        System.out.println(arara.getLocomocao());
        System.out.println(arara.getQtdOvos());

    }
}