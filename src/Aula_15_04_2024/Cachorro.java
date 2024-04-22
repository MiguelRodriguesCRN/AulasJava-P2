package Aula_15_04_2024;

public class Cachorro extends Animal implements Corrida{


    public Cachorro(String nome, int idade, TipoAnimal tipo) {
        super(nome, idade, tipo);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

    @Override
    public void correr(){
        System.out.println("Cachorro Correndo");
    }
    @Override
    public void Comer() {
        System.out.println("Cão Comendo");
    }
}
