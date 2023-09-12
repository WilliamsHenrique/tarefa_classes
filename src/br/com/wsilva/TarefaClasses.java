package br.com.wsilva;


public class TarefaClasses {
    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        System.out.println("Hello, Williams");
        Produto produto = new Produto();
        produto.cadastrarProduto("Iphone 14");
        produto.setOrigem("Estados Unidos da América");
        produto.setValor("R$14.899,99");
        System.out.println(produto.getNome());
        System.out.println(produto.getOrigem());
        System.out.println(produto.getValor());

    }
}
