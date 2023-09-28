package br.com.mod17;

public class Esportivo extends CarrosModernos{
    @Override
    public void nome() {
        System.out.println("CHEVROLET CAMARO");
    }

    @Override
    public void aceleracaoMaxima() {
        System.out.println("0 a 100 km/h: 4,2 s");
    }

    @Override
    public void velocidadeMaxima() {
        System.out.println("250 km/h");
    }

    @Override
    public void potencia() {
        System.out.println("461 cv");
    }

    @Override
    public void preco() {
        System.out.println("A partir de R$ 451.300");
    }

    @Override
    public void motor() {
        System.out.println("6.2 V8");
    }
}
