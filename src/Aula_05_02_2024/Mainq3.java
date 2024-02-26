package Aula_05_02_2024;

public class Mainq3 {
    public static void main(String[] args){

        int nota1 = 40;
        int nota2 = 40;
        int nota3 = 40;
        int soma;
        double media;

        soma = nota1+nota2+nota3;

        media = soma / 3;

        if (media >= 70) {
            System.out.println("O Aluno foi aprovado");
        } else if ((media >= 41) && (media < 70)) {
            System.out.println("O aluno foi para a Final");
        } else {
            System.out.println("O aluno foi reprovado");
        }


    }
}
