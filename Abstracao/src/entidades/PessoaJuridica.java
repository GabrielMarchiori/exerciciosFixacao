package entidades;

public class PessoaJuridica extends Pessoa {

    private Double numeroFuncionarios;

    public PessoaJuridica(String nome, Double salarioAnual, Double numeroFuncionarios) {
        super(nome, salarioAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Double getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Double numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }
}
