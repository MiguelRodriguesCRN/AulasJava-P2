package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicio_Herança_NotaDeAula03.Questão03;

public class ContaPoupança extends Conta {

    private double selic = 8.5;
    private double rendimento;

    public void rendimento() {
        if (selic > 8.5) {
            rendimento = 0.005 * saldo;
            System.out.println("Rendimento anual da sua conta: " + rendimento);
        } else {
            rendimento = 0.007 * selic * saldo;
            System.out.println("Rendimento anual da sua conta: " + rendimento);
        }
    }
}
