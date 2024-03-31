package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicio_Herança_NotaDeAula03.Questão03;


public class ContaCorrente extends Conta {

    public void ChequeEspecial(int valorSaque) {
        int limiteChequeEspecial = 1000; // Limite de cheque especial
        int saldoAposSaque = saldo - valorSaque;

        if (saldoAposSaque < 0) {
            int diferenca = Math.abs(saldoAposSaque); // Valor que excede o saldo atual
            if (diferenca <= limiteChequeEspecial) {
                saldo -= valorSaque;
                System.out.println("Cheque especial Aprovado de " + diferenca + "!!");
                System.out.println("Seu novo Saldo: " + saldo);
            } else {
                System.out.println("Limite de cheque especial excedido!");
            }
        } else {
            saldo -= valorSaque;
            System.out.println("Seu novo Saldo: " + saldo);
        }
    }
}