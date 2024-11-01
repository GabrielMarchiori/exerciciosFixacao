package utilitarios;

public class Empregados {
    private Integer id;
    private String nome;
    private Double salario;

    public Empregados(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void aumento(int aumento) {
        salario += (salario * aumento) / 100;
    }

    @Override
    public String toString() {
        return this.id + ", " + this.nome + ", " + toString().formatted("%.2f", this.salario);
    }
}
