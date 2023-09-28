package br.com.mod17;

import java.util.ArrayList;
import java.util.List;

public class Carro {
    public static void main(String[] args) {
        List<CarrosModernos> listaDeCarros = new ArrayList<>();
        listaDeCarros.add(new Sedans());
        listaDeCarros.add(new SUVs());
        listaDeCarros.add(new Utilitario());
        listaDeCarros.add(new Esportivo());


        for (CarrosModernos carro : listaDeCarros) {
            System.out.println("Características do Carro: " + carro.getClass().getSimpleName());
            carro.nome();
            carro.potencia();
            carro.preco();
            carro.motor();
            carro.aceleracaoMaxima();
            carro.velocidadeMaxima();
            System.out.println();
        }
    }
}
