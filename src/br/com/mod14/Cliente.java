package br.com.mod14;
/**
 * @author williams.silva
 */

public class Cliente {
    private String gradeRequesicao;
    private boolean contrato;

    public  Cliente(String gradeRequesicao, boolean contrato){
        this.gradeRequesicao = gradeRequesicao;
        this.contrato = contrato;
    }
    public boolean contrato(){
        return contrato;
    }
    public String getGradeRequesicao(){
        return gradeRequesicao;
    }

}
