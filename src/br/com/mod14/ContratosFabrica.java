package br.com.mod14;
/**
 * @author williams.silva
 */

public class ContratosFabrica extends Fabrica{
    @Override
    Carro retriveCarro(String requisecaoGrade) {
        if ("A".equals(requisecaoGrade)){
            return new FordK(250, "Metade", "Azul-Metalico");
        } else {
            return null;
        }
    }
}
