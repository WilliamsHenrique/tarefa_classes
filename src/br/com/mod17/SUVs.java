package br.com.mod17;

public class SUVs extends CarrosModernos{
    @Override
    public void nome() {
        System.out.println("Honda HR-V");

    }

    @Override
    public void aceleracaoMaxima() {
        System.out.println("100 km/h em 8,9 segundos");
    }

    @Override
    public void velocidadeMaxima() {
        System.out.println("175 km/h ");

    }

    @Override
    public void potencia() {
        System.out.println("126 HP");

    }

    @Override
    public void preco() {
        System.out.println("A partir de R$ 148.900");

    }

    @Override
    public void motor() {
        System.out.println("1,5 l 4 cilindros em linha");
    }
}
