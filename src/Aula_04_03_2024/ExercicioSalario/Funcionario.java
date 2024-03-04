package Aula_04_03_2024.ExercicioSalario;

public class Funcionario {

    private double ValorHora, salario;
    private int HorasTrabalhadas;

    public void setValorHora(double ValorHora) {
        this.ValorHora = ValorHora;
    }

    public void setHorasTrabalhadas(int HorasTrabalhadas) {
        this.HorasTrabalhadas = HorasTrabalhadas;
    }

    public double getValorHora() {
        return ValorHora;
    }

    public int getHorasTrabalhadas() {
        return HorasTrabalhadas;
    }

    public void CalcularSalario() {

        salario = HorasTrabalhadas * ValorHora;
        System.out.println("O Salario do funcionario é de " + salario);

    }
}