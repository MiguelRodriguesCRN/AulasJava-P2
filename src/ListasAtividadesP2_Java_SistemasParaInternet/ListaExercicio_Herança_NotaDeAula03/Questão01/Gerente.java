package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicio_Herança_NotaDeAula03.Questão01;

public class Gerente extends Funcionario {

    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double calcularBonus() {
        return 0.1 * getSalario();
    }

    public void exibirGerente() {
        super.exibir();
        System.out.println("_________________");
        System.out.println("SEÇÃO GERENTE: ");
        System.out.println("Departamento: "+departamento);
        System.out.println("Novo Salario: "+salario);
    }
}

