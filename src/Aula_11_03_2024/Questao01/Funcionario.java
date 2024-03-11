package Aula_11_03_2024.Questao01;

public class Funcionario {

    private String nome;
    private double salario = 1420;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibir() {
        System.out.println("Nome: "+ nome);
        System.out.println("Salario: " +salario);
    }
}
