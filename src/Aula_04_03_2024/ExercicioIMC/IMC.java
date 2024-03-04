package Aula_04_03_2024.ExercicioIMC;

public class IMC {

    private double altura, peso, imc;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void CalcularIMC() {

        imc = peso / (altura * altura);
        System.out.printf("Seu IMC é de: %.2f", imc);
    }

}
