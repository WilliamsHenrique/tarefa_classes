package br.com.mod14;
/**
 * @author williams.silva
 */


public abstract class Carro {
    private int potencia;
    private String gasolina;
    private String cor;

    public Carro(int potencia, String gasolina, String cor){
        this.potencia = potencia;
        this.gasolina = gasolina;
        this.cor = cor;
    }
    public void start(){
        System.out.println("O" + gasolina + "motor foi ligado e está pronto para ser usado" + potencia);
    }
    public void clean(){
        System.out.println("O carro foi limpo e o " + cor.toLowerCase() + "a cor brilha");
    }
    public void mechanicCheck(){
        System.out.println("O carro foi verificado pelo mecânico. Tudo parece bem!");
    }
    public void fuelCarro(){
        System.out.println("O carro está sendo abastecido" + gasolina.toLowerCase());
    }
}
