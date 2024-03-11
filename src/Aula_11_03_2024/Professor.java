package Aula_11_03_2024;

public class Professor {

    private double quantidade_hora, valor_hora, salario;

    public double getQuantidade_hora() {
        return quantidade_hora;
    }

    public void setQuantidade_hora(double quantidade_hora) {
        this.quantidade_hora = quantidade_hora;
    }

    public double getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(double valor_hora) {
        this.valor_hora = valor_hora;
    }


    public void CalcSalario() {

        salario = quantidade_hora * valor_hora;
        System.out.println("O Salario do professor é de " + salario);

    }
}
