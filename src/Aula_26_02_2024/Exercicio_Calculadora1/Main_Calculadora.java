package Aula_26_02_2024.Exercicio_Calculadora1;

import java.util.Scanner;

public class Main_Calculadora {
    public static void main(String[] args) {

        Calculadora c = new Calculadora();
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        int r;

do {
    System.out.println("Digite seu Primeiro Numero: ");
    x = sc.nextInt();

    System.out.println("Digite seu Segundo Numero: ");
    y = sc.nextInt();

    c.somar(x, y);

    System.out.println(c.total);

    System.out.println("Deseja Fazer mais ua soma: 1 = SIM | 0 = NÃO");
    r = sc.nextInt();
}while(r==1);
    }
}
