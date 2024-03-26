package ListaExercicios_MetMod_NotaDeAula02.Questão03;
import java.util.Scanner;

public class MainTriangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Triangulo t = new Triangulo();

        System.out.println("Lado 01: ");
        t.setLado1(sc.nextInt());
        System.out.println("Lado 02: ");
        t.setLado2(sc.nextInt());
        System.out.println("Lado 03: ");
        t.setLado2(sc.nextInt());

        t.Validacao();
    }
}
