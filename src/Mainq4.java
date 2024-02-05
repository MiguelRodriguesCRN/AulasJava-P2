public class Mainq4 {
    public static void main(String[] args){

        int salario = 3000;

        if (salario <= 900){
            System.out.println("Vc foi isento de IR!");
        } else if ((salario > 901) && (salario <= 1500)) {
            System.out.println("Vc terá um desconto de 5% de IR!");
        } else if ((salario > 1501) && (salario <= 2500)) {
            System.out.println("Vc terá um desconto de 10% de IR!");
        } else {
            System.out.println("Vc terá um desconto de 20% de IR!");
        }


    }
}
