package modelo.entidades;

public class OrdemItem {
    private Integer quantidade;
    private Double preco;

    private Produto produto;

    public OrdemItem(Integer quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.preco = produto.getPreco();
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public Double subTotal(){
        return quantidade * preco;
    }

    @Override
    public String toString() {
        return produto.toString() + ", Total: " + String.format("%.2f", subTotal());
    }
}
