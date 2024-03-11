package Aula_11_03_2024;

public class Aluno {

    private double n1, n2, media;

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void CalcMed() {

        media = (n1 + n2) / 2;

        if (media >= 7) {
            System.out.println("Vc foi aprovado");
        } else {
            System.out.println("Vc foi Reprovado");
        }
    }

}
