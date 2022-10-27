package model;

public class Produto {
    private String nome;
    private String descricao;
    private Double valor;
    private int estoque;

    //construtores
    public Produto() {

    }

    public Produto(String nome, String descricao, double valor, int estoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
    }

    //Getters

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getEstoque() {
        return estoque;
    }

    //Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setEstoque(int estoque) {
        int novoEstoque = this.estoque + estoque;
        if(novoEstoque > 0) {
            this.estoque = estoque;
        }
    }

    @Override
    public String toString() {
        return "\nProduto_Lista1 [nome=" + nome + ", descrição=" + descricao + ", valor=" + valor + ", estoque=" + estoque + "]";
    }

}