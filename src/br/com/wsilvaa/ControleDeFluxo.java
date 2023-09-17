package br.com.wsilvaa;

import java.util.Scanner;

public class ControleDeFluxo {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite suas 4 Nota");
        int nota = s.nextInt();
        nota += s.nextInt();
        nota += s.nextInt();
        nota += s.nextInt();
        nota = nota / 4;

        if ( nota >= 7 ) {
            System.out.println("Parabéns, você foi aprovado.");
        } else if ( nota >= 5) {
            System.out.println("Você está em Recuperação");
        } else {
            System.out.println("Infelizmente você foi Reprovado");
        }

    }

}
