package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicio_Construtores_NotaDeAula04.Questão03;

public class Carro {
    private String marca;
    private String modelo;


    public Carro(String marca, String modelo){
        this.marca  = marca;
        this.modelo = modelo;

    }

    public void mostrarDetalhes(){

        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);

    }
}
