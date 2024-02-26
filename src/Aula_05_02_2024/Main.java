package Aula_05_02_2024;

public class Main {
    public static void main(String[] args) {

        int num1 = 40;
        int num2 = 40;
        int total;

        total = num1 + num2;

        System.out.println("A soma dos numeros definidos são: " + total);

        if (num1 > num2) {
            System.out.println("Numero 1 maior que numero 2!");
        } else {
            System.out.println("O Numero 2 é maior que o Numero 1!");
        }

        if (num1 == num2) {
            System.out.println("Os numeros definidos são Iguals!");
        } else {
            System.out.println("Os numeros são diferentes!");
        }
    }
}