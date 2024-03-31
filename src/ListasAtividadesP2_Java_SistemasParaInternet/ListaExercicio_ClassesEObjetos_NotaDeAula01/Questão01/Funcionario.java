package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicio_ClassesEObjetos_NotaDeAula01.Questão01;

public class Funcionario {

    int Matricula;
    String nome;
    int Salario;
    double SalarioLiquido;
    double deducao;

    public void Calculo() {

        double deducao = Salario * 0.15;
        double SalarioLiquido = Salario - deducao;

        System.out.println("Salario: " + Salario );
        System.out.println("Dedução INSS: 15%");
        System.out.println("Salario Lquido: " +SalarioLiquido);

    }


}
