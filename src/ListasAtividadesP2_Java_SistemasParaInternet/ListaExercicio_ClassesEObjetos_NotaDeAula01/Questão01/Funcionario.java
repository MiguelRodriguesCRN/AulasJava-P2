package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicio_ClassesEObjetos_NotaDeAula01.Questão01;

public class Funcionario {

    int Matricula;
    String nome;
    int Salario;
    int SalarioLiquido;

    public void Calculo() {
        SalarioLiquido = 15 * (Salario / 100);
    }


}
