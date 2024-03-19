package Aula_18_03_2024.Ex01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno al = new Aluno("Miguel", 2019530036);
        Aluno al1 = new Aluno();

        System.out.println("Digite seu nome: ");
        al1.setNome(sc.next());
        System.out.println("Digite sua matricula: ");
        al1.setMatricula(sc.nextInt());


        System.out.println("Seu Nome: "+al1.getNome()+"| Matricula: "+al1.getMatricula());

    }
}
