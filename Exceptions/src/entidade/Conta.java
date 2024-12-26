package entidade;

import modelo.Excecoes;

public class Conta {
    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteSaque;

    public Conta(Double limiteSaque, Integer numero, Double saldo, String titular) {
        this.limiteSaque = limiteSaque;
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void deposito(Double deposito) {

    }

    public void saque(Double saque) throws Excecoes {
        if (saldo > 0 && saldo >= saque && saque <= limiteSaque) {
            saldo -= saque;
        } else if (saldo <= 0){
            throw new Excecoes("Seu saldo esta zerado");
        } else if (saldo < saque) {
            throw new Excecoes("Seu saldo e menor que o valor que deseja sacar");
        } else if (saque > limiteSaque) {
            throw new Excecoes("Este valor ultrapassa o limite de saque");

        }
    }

    @Override
    public String toString() {
        return "Novo saldo: " + this.saldo;
    }
}
