package entidades;

public class PessoaJuridica extends Pessoa {

    private Integer numeroFuncionarios;

    public PessoaJuridica(String nome, Double salarioAnual, Integer numeroFuncionarios) {
        super(nome, salarioAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public Double imposto(){
        Double imposto = 0.0;
        if (this.getNumeroFuncionarios() <= 10){
            imposto = this.getSalarioAnual() * 0.16;
        }
        else if (this.getNumeroFuncionarios() > 10){
            imposto = this.getSalarioAnual() * 0.14;
        }
        return imposto;
    }
}
