package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicio_ClassesEObjetos_NotaDeAula01.Questão01;

import java.util.Scanner;

public class MainFuncionario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario fun = new Funcionario();

        System.out.println("Digite seu nome: ");
        fun.nome = sc.next();
        System.out.println("Digite sua Matricula: ");
        fun.Matricula = sc.nextInt();
        System.out.println("Digite seu salario: ");
        fun.Salario = sc.nextInt();

        fun.Calculo();



    }

}
