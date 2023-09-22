package br.com.mod12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Colecoes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> alunos = new ArrayList<>();
        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();

        System.out.println("Digite os nomes e sexo (separados por , ) - Digite 'sair' para encerrar:");

        while (true) {
            String alunx = s.nextLine();

            //O "Collections.sort(alunos);" não estava sendo lida por conta desta condição, fiz uma pesquisa minusiosa e descobri isso.
            if (alunx.equalsIgnoreCase("sair")) {
                        break;
            }

            String[] grupo = alunx.split(", ");

            if (grupo.length != 2) {
                        System.out.println("Digite nome e sexo separados por , ");
                        continue;
            }

            String nome = grupo[0];
            String sexo = grupo[1];

            alunos.add(nome);

            if (sexo.equalsIgnoreCase("M")) {
                        masculino.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                        feminino.add(nome);
            } else {
                        System.out.println("Sexo inválido. Use 'M' para masculino ou 'F' para feminino.");
            }
        }

        Collections.sort(alunos);

        System.out.println("Nomes em ordem alfabética:");
        for (String nome : alunos) {
            System.out.println(nome);
        }

        System.out.println("Grupo Masculino: " + masculino);
        System.out.println("Grupo Feminino: " + feminino);
    }
}
