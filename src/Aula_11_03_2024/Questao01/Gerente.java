package Aula_11_03_2024.Questao01;

public class Gerente extends Funcionario {

    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double CalcularBonus() {
        return 0.1 * getSalario();
    }
    public void exibirGerente() {
        super.exibir(); // Chama o método de Funcionario
        System.out.println("Departamento: " + departamento);
        System.out.println("Seu novo salario: "+ getSalario());
    }
}
