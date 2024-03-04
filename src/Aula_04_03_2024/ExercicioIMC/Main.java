package Aula_04_03_2024.ExercicioIMC;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        IMC p = new IMC();


        System.out.println("Digite seu peso: ");
        p.setPeso(sc.nextDouble());
        System.out.println("Digite sua Altura: ");
        p.setAltura(sc.nextDouble());
        p.CalcularIMC();
        System.out.println(" Seu peso é de: " +p.getPeso()+" | Sua ltura é de: "+p.getAltura()+
                " | Seu IMC é de: ");

    }
}
