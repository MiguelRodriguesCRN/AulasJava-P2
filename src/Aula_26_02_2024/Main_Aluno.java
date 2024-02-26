package Aula_26_02_2024;

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

        int media = (a.nota1 + a.nota2 + a.nota3) / 3;

        System.out.println("Seu nome é: "+ a.nome + " Sua média é: " + media);

    }
}
