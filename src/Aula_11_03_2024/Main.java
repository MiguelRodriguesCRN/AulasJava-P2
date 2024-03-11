package Aula_11_03_2024;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Professor pr = new Professor();
        Aluno al = new Aluno();
        Scanner sc = new Scanner(System.in);
        int login;

        System.out.println("Deseja Entrar no Sistema Aluno ou Professor: (ALUNO = 1) (PROFESSOR = 2)");
        login = sc.nextInt();
        switch (login) {
            case 1:
                System.out.println("Digite sua Nota 01:");
                al.setN1(sc.nextInt());
                System.out.println("Digite sua Nota 02:");
                al.setN2(sc.nextInt());

                al.CalcMed();
                break;
            case 2:

                System.out.println("Digite O Valor da hora: ");
                pr.setValor_hora(sc.nextDouble());
                System.out.println("Digite quantas Horas vc trabalhou: ");
                pr.setQuantidade_hora(sc.nextInt());

                pr.CalcSalario();
        }

    }
}
