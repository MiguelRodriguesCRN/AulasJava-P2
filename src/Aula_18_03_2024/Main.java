package Aula_18_03_2024;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Carro c = new Carro("Mitsubishi", "Lancer EVO XI", 2024);
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();

        Vendedor vendedor = new Vendedor();

        Scanner sc = new Scanner(System.in);

        int select1;
        int select_carro;

        System.out.println("Digite seu NOME: ");
        vendedor.setNome(sc.next());
        System.out.println("Digite sua Matricula: ");
        vendedor.setMatricula(sc.nextInt());
        System.out.println("Deseja cadastrar um novo carro? [1 = SIM] [2 = NÃO]");
        select1 = sc.nextInt();
        while (select1 == 1) {

            System.out.println("Digite a Marca: ");
            c1.setMarca(sc.next());
            System.out.println("Digite o Modelo: ");
            c1.setModelo(sc.next());
            System.out.println("Digite o Ano: ");
            c1.setAno(sc.nextInt());

            System.out.println("Deseja cadastrar outro carro? [1 = SIM] [2 = NÃO]");
            select1 = sc.nextInt();

            if (select1 == 1) {

                System.out.println("Digite a Marca: ");
                c2.setMarca(sc.next());
                System.out.println("Digite o Modelo: ");
                c2.setModelo(sc.next());
                System.out.println("Digite o Ano: ");
                c2.setAno(sc.nextInt());

                System.out.println("Deseja cadastrar outro carro? [1 = SIM] [2 = NÃO]");
                select1 = sc.nextInt();
                if (select1 == 1) {


                    System.out.println("Digite a Marca: ");
                    c3.setMarca(sc.next());
                    System.out.println("Digite o Modelo: ");
                    c3.setModelo(sc.next());
                    System.out.println("Digite o Ano: ");
                    c3.setAno(sc.nextInt());

                    System.out.println("Deseja cadastrar outro carro? [1 = SIM] [2 = NÃO]");
                    select1 = sc.nextInt();
                }

            }
        }

        System.out.println("Deseja ver qual dos carros? [1 = CARRO 1] [2 = CARRO 1] [3 = CARRO 1]");
        select_carro = sc.nextInt();
        switch (select_carro) {

            case 1:
                System.out.println("Marca: "+ c1.getMarca());
                System.out.println("Modelo: "+ c1.getModelo());
                System.out.println("Ano: "+ c1.getAno());

                break;

            case 2:

                System.out.println("Marca: "+ c2.getMarca());
                System.out.println("Modelo: "+ c2.getModelo());
                System.out.println("Ano: "+ c2.getAno());

                break;

            case 3:
                System.out.println("Marca: "+ c3.getMarca());
                System.out.println("Modelo: "+ c3.getModelo());
                System.out.println("Ano: "+ c3.getAno());

                break;
        }
    }
}
