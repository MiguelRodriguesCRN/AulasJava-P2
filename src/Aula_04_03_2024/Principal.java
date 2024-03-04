package Aula_04_03_2024;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        pessoa p = new pessoa();


        System.out.println("Digite sua idade: ");
        p.setIdade(sc.nextInt());
        System.out.println("Idade: "+ p.getIdade());
        System.out.println("Digite Seu Nome: ");
        p.setNome(sc.nextLine());
        System.out.println("Nome: " + p.getNome());

    }
}
