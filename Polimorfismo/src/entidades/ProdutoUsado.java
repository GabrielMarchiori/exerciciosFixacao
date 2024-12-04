package entidades;

import java.util.Date;

public class ProdutoUsado extends Produto {

    private Date dataFabricao;

    public ProdutoUsado(String nome, Double preco, Date dataFabricao) {
        super(nome, preco);
        this.dataFabricao = dataFabricao;
    }

    public Date getDataFabricao() {
        return dataFabricao;
    }

    public void setDataFabricao(Date dataFabricao) {
        this.dataFabricao = dataFabricao;
    }

    @Override
    public String etiquetaPreco(){
        return this.getNome() + " (usado) " + this.getPreco() + " (Fabricação: " + this.getDataFabricao() + ")";
    }
}
