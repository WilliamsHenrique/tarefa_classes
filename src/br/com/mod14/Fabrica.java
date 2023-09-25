package br.com.mod14;
/**
 * @author williams.silva
 */

public abstract class Fabrica {
    public Carro create(String requisecaoGrade){
        Carro carro = retriveCarro(requisecaoGrade);
        carro = prepararCarro(carro);
        return carro;
    }
    private Carro prepararCarro(Carro carro){
        carro.clean();
        carro.mechanicCheck();
        carro.fuelCarro();
        return carro;
    }
    abstract Carro retriveCarro(String requisecaoGrade);
}
