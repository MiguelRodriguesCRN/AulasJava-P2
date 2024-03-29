package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicio_Herança_NotaDeAula03.Questão01;

import java.util.Scanner;

public class MainFuncionario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Gerente gr = new Gerente();
        Diretor dr = new Diretor();
        int select;

        System.out.println("Seleção de Sistemas: [1 = Gerente] [2 = Diretor]");
        select = sc.nextInt();
        switch (select) {
            case 1:
                System.out.println("Digite seu Nome: ");
                gr.setNome(sc.next());
                System.out.println("Digite seu Departamento: ");
                gr.setDepartamento(sc.next());

                gr.calcularBonus();
                gr.exibirGerente();

                break;

            case 2:
                System.out.println("Digite seu nome: ");
                dr.setNome(sc.next());
                System.out.println("Digite sua quantidade de ações: ");
                dr.setAcoes(sc.nextInt());

                dr.exibirAcoes();

                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
