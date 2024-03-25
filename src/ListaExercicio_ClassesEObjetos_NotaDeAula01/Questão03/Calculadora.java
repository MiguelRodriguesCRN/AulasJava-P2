package ListaExercicio_ClassesEObjetos_NotaDeAula01.Questão03;

public class Calculadora {

    int num1, num2;
    int result;

    public void Soma() {
        result = num1 + num2;
        System.out.println("A soma dos numeros informados é de: "+result);
    }

    public void Subtração() {
        result = num1 - num2;
        System.out.println("A subtração dos numeros informados é de: "+result);
    }

    public void Multiplicacao() {
        result = num1 * num2;
        System.out.println("A multiplicação dos numeros informados é de: "+result);
    }

    public void Divisao() {
        result = num1 / num2;
        System.out.println("A divisão dos numeros informados é de: "+result);
    }
}
