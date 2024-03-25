package AulasLigaEstudantil.Aula01_LigaEstudantil.Exercicio01;

public class Pessoa {

    int idd = 20;
    int id2 = 50;

    int f;

    public static void main(String[] args) {

        Pessoa p = new Pessoa();

        p.f = p.idd + p.id2;
        System.out.println(p.f);
    }
}
