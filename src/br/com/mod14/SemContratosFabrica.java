package br.com.mod14;
/**
 * @author williams.silva
 */

public class SemContratosFabrica extends Fabrica{
    @Override
    Carro retriveCarro(String requisecaoGrade) {
        if ("A".equals(requisecaoGrade)){
            return new Jeep(285, "Cheia", "Vermelho-Metalico");
        } else {
            return null;
        }
    }
}
