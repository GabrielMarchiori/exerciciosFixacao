package entidades;

public class ProdutoImportado extends Produto {

    private Double taxaAlfandegaria;

    public ProdutoImportado(String nome, Double preco, Double quantidade) {
        super(nome, preco);
        this.taxaAlfandegaria = quantidade;
    }

    public Double taxaAlfandegaria() {
        return taxaAlfandegaria;
    }

    public void taxaAlfandegaria(Double quantidade) {
        this.taxaAlfandegaria = quantidade;
    }

    @Override
    public String etiquetaPreco() {
        return super.etiquetaPreco() + " (" + this.taxaAlfandegaria + ")";
    }
}
