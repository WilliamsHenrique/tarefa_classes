package br.com.mod17;

public class Sedans extends CarrosModernos{
    @Override
    public void nome() {
        System.out.println("Volkswagen Virtus");

    }

    @Override
    public void aceleracaoMaxima() {
        System.out.println("8,5 - 11,7 segundos");

    }

    @Override
    public void velocidadeMaxima() {
        System.out.println("192 - 196 km/h");

    }

    @Override
    public void potencia() {
        System.out.println("116 HP");

    }

    @Override
    public void preco() {
        System.out.println("A partir de R$ 106.990");

    }

    @Override
    public void motor() {
        System.out.println("1,0 l 3 cilindros em linha");

    }
}
