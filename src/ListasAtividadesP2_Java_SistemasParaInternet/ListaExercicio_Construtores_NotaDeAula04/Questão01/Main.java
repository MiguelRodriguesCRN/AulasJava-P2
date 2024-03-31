package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicio_Construtores_NotaDeAula04.Questão01;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno al = new Aluno("Miguel", 17, 2020);
        Professor prof = new Professor("Greici", 54, 5000);

        System.out.println("Aluno: ");
        System.out.println("Nome: "+al.getNome());
        System.out.println("Idade: "+al.getIdade());
        System.out.println("Matricula: "+al.getMatricula());
        System.out.println("_________________");
        System.out.println("Professor: ");
        System.out.println("Nome: "+prof.getNome());
        System.out.println("Idade: "+prof.getIdade());
        System.out.println("SALARIO: "+prof.getSalario());
    }
}
