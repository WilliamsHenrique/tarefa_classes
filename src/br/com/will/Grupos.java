package br.com.will;

import java.util.ArrayList;
import java.util.Scanner;

public class Grupos {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        ArrayList<String> grupoMasculino = new ArrayList<>();
        ArrayList<String> grupoFeminino = new ArrayList<>();

        while(true){
            System.out.print("Digite seu nome: ");
            String nome = s.nextLine();


            System.out.print("Digite o sexo (M para masculino, F para feminino): ");
            String sexo = s.nextLine();

            if (sexo.equalsIgnoreCase("M")){
                grupoMasculino.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                grupoFeminino.add(nome);
            } else {
                System.out.print("Sexo inválido. Use 'M' para masculino ou 'F' para feminino.");
            }
            System.out.println("Grupo Masculino:" + grupoMasculino);
            System.out.println("Grupo Feminino:" + grupoFeminino);

   }

}

}