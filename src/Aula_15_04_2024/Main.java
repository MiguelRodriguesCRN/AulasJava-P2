package Aula_15_04_2024;

public class Main {
    public static void main(String[] args) {

        Animal c1 = new Cachorro("Salsicha", 2, TipoAnimal.MAMIFERO);
        Animal p1 = new Passarinho("MarocaPerdeParABemTivi", 20, TipoAnimal.AVE);
        Animal g1 = new Gato("Pudim", 3, TipoAnimal.MAMIFERO);



        c1.emitirSom();
        ((Cachorro)c1).correr();

        p1.emitirSom();
        ((Passarinho)p1).Comer();

        g1.emitirSom();
        ((Gato)g1).correr();
    }
}
