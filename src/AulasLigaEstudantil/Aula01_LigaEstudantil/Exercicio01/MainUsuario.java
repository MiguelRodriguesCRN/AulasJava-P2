package AulasLigaEstudantil.Aula01_LigaEstudantil.Exercicio01;
import AulasLigaEstudantil.Aula01_LigaEstudantil.Usuario;

import java.util.Scanner;

public class MainUsuario {
    public static void main (String[] scr) {

        Usuario us = new Usuario();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        us.setNome();

    }
}
