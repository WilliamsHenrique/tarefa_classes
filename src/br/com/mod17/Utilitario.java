package br.com.mod17;

public class Utilitario extends CarrosModernos{
    @Override
    public void nome() {
        System.out.println("Toyota Hilux");
    }

    @Override
    public void aceleracaoMaxima() {
        System.out.println("0-100 km/h, 12s");
    }

    @Override
    public void velocidadeMaxima() {
        System.out.println("180 km/h");
    }

    @Override
    public void potencia() {
        System.out.println("204 cv");
    }

    @Override
    public void preco() {
        System.out.println("A partir de R$ 339.190");
    }

    @Override
    public void motor() {
        System.out.println("2.8, de 4 cilindros em linha");
    }
}
