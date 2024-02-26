package Aula_26_02_2024;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){

        pessoa p = new pessoa();
        Scanner sc = new Scanner(System.in);

        System.out.println("Antiga "+ p.idade);
        p.niver();

        System.out.println("Atual "+ p.idade);

        System.out.println("Digite sey nome");
        p.nome=sc.next();

        System.out.println("Digite sua Idade ");
        p.idade=sc.nextInt();

        System.out.println("Seu nome é "+ p.nome+ "Sua Idade é " + p.idade);



    }

}
