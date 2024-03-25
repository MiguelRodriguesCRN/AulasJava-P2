package ListaExercicio_ClassesEObjetos_NotaDeAula01.Questão03;
import java.sql.PseudoColumnUsage;
import java.util.Scanner;

public class MainCalculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculadora c = new Calculadora();
        int select;

        System.out.println("Digite o 1 numero: ");
        c.num1 = sc.nextInt();
        System.out.println("Digite o 2 numero: ");
        c.num2 = sc.nextInt();

        System.out.println("Escolha a operação matematica:  [1 = Soma] | [2 = Subtração] | [3 = Multiplicação]" +
                "| [4 = Divisão}");
        select = sc.nextInt();

        if (select == 1) {
            c.Soma();
        } else if (select == 2) {
            c.Subtração();
        } else if (select == 3) {
            c.Multiplicacao();
        } else if (select == 4) {
            c.Divisao();
        }


    }
}
