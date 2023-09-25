package br.com.mod14;
/**
 * @author williams.silva
 */

public class Demo {
    public static void main(System args[]){
        Cliente cliente = new Cliente("A", false);
        Fabrica fabrica = getFabrica(cliente);
        Carro carro = fabrica.create(cliente.getGradeRequesicao());
        carro.start();
    }
    private static Fabrica getFabrica(Cliente cliente){
        if (cliente.contrato()){
            return new ContratosFabrica();
        } else {
            return new SemContratosFabrica();
        }
    }
}
