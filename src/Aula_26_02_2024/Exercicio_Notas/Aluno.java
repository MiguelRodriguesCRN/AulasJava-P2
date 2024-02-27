package Aula_26_02_2024.Exercicio_Notas;

public class Aluno {

    String nome;
    int nota1;
    int nota2;
    int nota3;

    int media;

    public void media() {
        media = (nota1 + nota2 + nota3) / 3;
    }
}
