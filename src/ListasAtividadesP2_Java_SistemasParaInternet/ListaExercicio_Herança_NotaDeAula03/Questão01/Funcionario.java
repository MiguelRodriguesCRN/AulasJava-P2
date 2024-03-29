package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicio_Herança_NotaDeAula03.Questão01;

public class Funcionario {
    protected String nome;
    protected int salario = 1000;

    public String getNome() {
        return nome;
    }

    public int getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(int salario) {
        this.nome = nome;
    }

    public void exibir() {
        System.out.println("Nome: "+nome);
        System.out.println("Salario: "+salario);
    }
}
