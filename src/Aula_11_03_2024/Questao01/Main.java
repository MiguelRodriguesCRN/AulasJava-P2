package Aula_11_03_2024.Questao01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Diretor dr = new Diretor();
            Gerente gr = new Gerente();
            Scanner sc = new Scanner(System.in);
            int select;

        System.out.println("Digite 1 Para entrar no sistema de Diretor e 2 para o Sistema de Gerente");
        select = sc.nextInt();
        switch (select){
            case 1:
                System.out.println("Digite seu nome");
                dr.setNome(sc.next());
                System.out.println("Digite sua qtd de ações: ");
                dr.setAcoes(sc.nextInt());

                dr.ExibirAcao();
                break;

            case 2:
                System.out.println("Digite seu Nome: ");
                gr.setNome(sc.next());
                System.out.println("Digite seu Departamento: ");
                gr.setDepartamento(sc.next());

                gr.CalcularBonus();
                gr.exibirGerente();
        }

    }
}
