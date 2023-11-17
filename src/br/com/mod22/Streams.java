package br.com.mod22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Streams {
    public static void main(String[] args) {
        List<String[]> pessoas = lerDados();
        List<String[]> mulheres = somenteMulheres(pessoas);

        System.out.println("Mulheres na lista: ");
        for (String[] mulher : mulheres){
            System.out.println(mulher[0]);
        }
    }

    private static List<String[]> lerDados() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome e sexo das pessoas separados por vírgula (ex: Maria,F, João,M): ");
        String[] dados = s.nextLine().split(",");
        List<String[]> pessoas = new ArrayList<>();
        for (int i = 0; i < dados.length; i += 2) {
            String[] pessoa = {dados[i],dados[i + 1]};
            pessoas.add(pessoa);
        }
        return pessoas;
    }
    private static List<String[]> somenteMulheres(List<String[]> pessoas){
        List<String[]> mulheres = new ArrayList<>();
        pessoas.forEach(pessoa -> {
            if (pessoa[1].equalsIgnoreCase("F")){
                mulheres.add(pessoa);
            }
        });
        return mulheres;
    }
}
