package Aula_15_04_2024;

public class Gato extends Animal implements Corrida{

    public Gato(String nome, int idade, TipoAnimal tipo) {
        super(nome, idade, tipo);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    @Override
    public void correr(){

    }

    @Override
    public void Comer() {
        System.out.println("Gato Comendo...");
    }
}
