package Aula_15_04_2024;

public class Passarinho extends Animal implements Corrida{
    public Passarinho(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O PAPACAPIM DUS MEUS SONHIU");
    }

    @Override
    public void correr(){

    }
}
