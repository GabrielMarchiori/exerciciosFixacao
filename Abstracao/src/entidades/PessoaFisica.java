package entidades;

public class PessoaFisica extends Pessoa {

    private Double gastoSaude;

    public PessoaFisica(String nome, Double salarioAnual, Double gastoSaude) {
        super(nome, salarioAnual);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public Double imposto(){
        Double imposto = 0.0;
        if (this.getSalarioAnual() < 20000){
            imposto = this.getSalarioAnual() * 0.15;
        }
        else if (this.getSalarioAnual() > 20000){
            imposto = (this.getSalarioAnual() * 0.25) - (this.getGastoSaude() * 0.5);
        }
        return imposto;
    }
}
