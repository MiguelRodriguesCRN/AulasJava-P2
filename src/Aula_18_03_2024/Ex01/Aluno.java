package Aula_18_03_2024.Ex01;

public class Aluno extends Pessoa {
    private int matricula;


    public Aluno(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public Aluno() {

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
