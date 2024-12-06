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

    @Override
    public Double imposto(){
        Double imposto = 0.0;
        if (this.getNumeroFuncionarios() <= 10){
            imposto = this.getSalarioAnual() * 0.14;
        }
        else if (this.getNumeroFuncionarios() > 10){
            imposto = this.getSalarioAnual() * 0.16gi;
        }
        return imposto;
    }
}
