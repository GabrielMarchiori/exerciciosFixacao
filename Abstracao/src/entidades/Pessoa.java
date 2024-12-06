package entidades;

public abstract class Pessoa {
    private String nome;
    private Double salarioAnual;

    public Pessoa(String nome, Double salarioAnual) {
        this.nome = nome;
        this.salarioAnual = salarioAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioAnual() {
        return salarioAnual;
    }

    public abstract Double imposto();
}
