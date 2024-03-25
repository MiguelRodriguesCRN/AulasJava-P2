package ListaExercicio_ClassesEObjetos_NotaDeAula01.Questão02;

import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno al = new Aluno();

        System.out.println("Digite seu nome: ");
        al.nome = sc.next();
        System.out.println("Digite sua primeira nota: ");
        al.n1 = sc.nextInt();
        System.out.println("Digite sua segunda nota: ");
        al.n2 = sc.nextInt();
        System.out.println("Digite sua terceira nota: ");
        al.n3 = sc.nextInt();

        al.CalculoMedia();

        if (al.media >= 7) {

            System.out.println("Sua média é: " + al.media);
            System.out.println("Vc foi aprovado");

        } else if (al.media <= 60 & al.media < 40) {
            System.out.println("Sua média final é: " + al.media);
            System.out.println("Vc foi reprovado");


        } else if (al.media > 40) {
            System.out.println("Sua média final é: " + al.media);
            System.out.println("Vc foi reprovado");
        }
    }
}
