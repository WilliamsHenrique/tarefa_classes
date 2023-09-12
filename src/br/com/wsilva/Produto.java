package br.com.wsilva;

/**
 * @author williams.silva
 */
class Produto {

    private int codigo;

    private String nome;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    private String valor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    private String origem;


    public void cadastrarProduto(String nome) {
        setNome(nome);

    }

}
