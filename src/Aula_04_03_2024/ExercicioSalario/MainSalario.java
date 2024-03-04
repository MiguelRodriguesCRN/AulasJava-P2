package Aula_04_03_2024.ExercicioSalario;

import java.util.Scanner;

public class MainSalario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();

        System.out.println("Digite O Valor da hora: ");
        f.setValorHora(sc.nextDouble());
        System.out.println("Digite quantas Horas vc trabalhou: ");
        f.setHorasTrabalhadas(sc.nextInt());

        f.CalcularSalario();

        System.out.println("O Valor da hora Trabalhada é de: " + f.getValorHora() + " O Funcionario trabalhou: " + f.getHorasTrabalhadas() +
                "horas");

    }
}
