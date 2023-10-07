package br.com.mod19;

import br.com.mod18.Tabela;
import java.lang.reflect.Method;

/**
 * @author williams.silva
 */

public class LerTabela{
    public static void main(String[] args) throws NoSuchMethodException {
        Class<MinhaClasse> classe = MinhaClasse.class;
        Method metodo = classe.getMethod("meuMetodo");
        Tabela minhaAnnotation = (Tabela) metodo.getAnnotation(Tabela.class);
        if (minhaAnnotation != null) {
            String valor = minhaAnnotation.valor();
            System.out.println("Valor lido da Annotation: " + valor);
        }
    }
    public static class MinhaClasse {
        @Tabela(valor = "Minha Tabela")
        public void meuMetodo() {
        }
    }
}
