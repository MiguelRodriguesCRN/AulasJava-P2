package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicio_Herança_NotaDeAula03.Questão03;
import java.util.Scanner;

public class MainConta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupança cp = new ContaPoupança();
        int select_tipo_conta;
        int select_operacao;
        boolean repetir = true;

        System.out.println("Digite seu nome: ");
        c.setNome(sc.next());
        System.out.println("Deseja acessar: [1 = Conta Corrente] [2 = Conta Poupança]");
        select_tipo_conta = sc.nextInt();

        switch (select_tipo_conta) {
            case 1:
                do {
                    System.out.println("O que deseja fazer em sua conta corrente: [1 = Depositar] [2 = Sacar] " +
                            "[3 = Tentativa de Cheque Especial] [4 = Exibir dados da conta]");
                    select_operacao = sc.nextInt();

                    switch (select_operacao) {
                        case 1:
                            System.out.println("Digite o valor que deseja Depositar: ");
                            c.setValor_deposito(sc.nextInt());
                            c.Depositar();
                            break;

                        case 2:
                            System.out.println("Digite o valor que deseja Sacar: ");
                            c.setValor_saque(sc.nextInt());
                            c.sacar();
                            break;

                        case 3:
                            cc.ChequeEspecial();
                            break;

                        case 4:
                            c.ExibirDados();
                            break;

                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }

                    System.out.println("Deseja repetir uma operação? [1 = Sim / 2 = Não]");
                    int repetirOpcao = sc.nextInt();
                    if (repetirOpcao != 1) {
                        repetir = false;
                    }
                } while (repetir);
                break;

            case 2:
                do {
                    System.out.println("O que deseja fazer em sua conta poupança: [1 = Depositar] [2 = Sacar] " +
                            "[3 = Rendimento] [4 = Exibir dados da conta]");
                    select_operacao = sc.nextInt();

                    switch (select_operacao) {
                        case 1:
                            System.out.println("Digite o valor que deseja Depositar: ");
                            c.setValor_deposito(sc.nextInt());
                            c.Depositar();
                            break;

                        case 2:
                            System.out.println("Digite o valor que deseja Sacar: ");
                            c.setValor_saque(sc.nextInt());
                            c.sacar();
                            break;

                        case 3:
                            cp.rendimento();
                            break;

                        case 4:
                            c.ExibirDados();
                            break;

                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }

                    System.out.println("Deseja repetir uma operação? [1 = Sim / 2 = Não]");
                    int repetirOpcao = sc.nextInt();
                    if (repetirOpcao != 1) {
                        repetir = false;
                    }
                } while (repetir);
                break;

            default:
                System.out.println("Opção de conta inválida.");
                break;
        }
    }
}

