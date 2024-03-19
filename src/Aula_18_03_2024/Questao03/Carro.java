package Aula_18_03_2024.Questao03;

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
