package Aula_26_02_2024.Exercicio_Notas;

import java.util.Scanner;

public class Main_Aluno {
    public static void main(String[] args) {

        Aluno a = new Aluno();
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite seu nome");
        a.nome=sc.next();

        System.out.println("Digite sua N1:");
        a.nota1=sc.nextInt();

        System.out.println("Digite sua N2:");
        a.nota2=sc.nextInt();

        System.out.println("Digite sey nome");
        a.nota3=sc.nextInt();

        a.media();

        if (a.media >= 7) {
            System.out.println("Seu nome é: "+ a.nome + " Sua média é: " + a.media + " E vc foi APROVADO!!");
        } else {
            System.out.println("Seu nome é: "+ a.nome + " Sua média é: " + a.media + " E vc foi REPROVADO!!");
        }


    }
}
