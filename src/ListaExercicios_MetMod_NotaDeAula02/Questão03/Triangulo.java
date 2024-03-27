package ListaExercicios_MetMod_NotaDeAula02.Questão03;

public class Triangulo {

    private double lado1, lado2, lado3;

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public void Validacao() {

        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("É um triangulo Equilátero");
        } else if ((lado1 == lado2)) {
            System.out.println("É um triangulo Isóceles");
        } else if ((lado1 != lado2 ) && (lado1 != lado3)) {
            System.out.println("É um triangulo Escaleno");
        } else if ((lado1 == 0) && (lado2 == 0) && (lado3 == 0)) {
            System.out.println("Não pode ser um triangulo!!!!");
        }

    }

}
