package ListaExercicio_ClassesEObjetos_NotaDeAula01.Questão01;

import java.util.Scanner;

public class MainFuncionario {
    public void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario fun = new Funcionario();

        System.out.println("Digite seu nome: ");
        fun.nome = sc.next();
        System.out.println("Digite sua Matricula: ");
        fun.Matricula = sc.nextInt();
        System.out.println("Digite seu salario: ");
        fun.Salario = sc.nextInt();

        fun.Calculo();

        System.out.println("Salario: " + fun.Salario );
        System.out.println("Dedução INSS: 15%");
        System.out.println("Salario Lquido: " + fun.SalarioLiquido);


    }

}
