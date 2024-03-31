package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicio_Construtores_NotaDeAula04.Questão01;

public class Professor extends Pessoa{
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Professor(String nome, int idade, int salario) {
        super(nome, idade);
        this.salario = salario;
    }
}
