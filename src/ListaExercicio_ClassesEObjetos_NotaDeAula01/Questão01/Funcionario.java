package ListaExercicio_ClassesEObjetos_NotaDeAula01.Questão01;

public class Funcionario {

    int Matricula;
    String nome;
    int Salario;
    int SalarioLiquido;

    public void Calculo() {
        SalarioLiquido = Salario * (100/15);
    }


}
