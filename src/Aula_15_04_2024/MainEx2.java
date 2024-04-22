package Aula_15_04_2024;

public class MainEx2 {
    public static void main(String[] args) {

        Animal c1 = new Cachorro("Salsicha", 2, TipoAnimal.MAMIFERO);
        Animal p1 = new Passarinho("MarocaPerdeParABemTivi", 20, TipoAnimal.AVE);
        Animal g1 = new Gato("Pudim", 3, TipoAnimal.MAMIFERO);
        Transformacao t = new Transformacao();
        Cachorro c2 = new Cachorro("Caramelo", 5, TipoAnimal.MAMIFERO);

        t.praticarCorrida(c2);
        t.praticarCorrida(c2);
        t.fazerComer(c2);



    }
}

