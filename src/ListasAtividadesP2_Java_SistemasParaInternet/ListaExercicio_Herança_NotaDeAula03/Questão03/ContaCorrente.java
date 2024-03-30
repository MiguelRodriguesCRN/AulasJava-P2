package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicio_Herança_NotaDeAula03.Questão03;

public class ContaCorrente extends Conta {


    public void ChequeEspecial() {
        System.out.println("Cheque especial Aprovado de 1000!!");
        saldo = saldo + 1000;
        System.out.println("Seu novo Saldo: "+saldo);
    }
}