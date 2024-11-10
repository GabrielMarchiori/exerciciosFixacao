package modelo.entidades;

import java.util.Date;

public class Cliente {
    private String nome;
    private String email;
    private Date dataAniversario;

    public Cliente(String nome, String email, Date dataAniversario) {
        this.nome = nome;
        this.email = email;
        this.dataAniversario = dataAniversario;
    }

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Date getDataAniversario() {
        return dataAniversario;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataAniversario(Date dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    @Override
    public String toString() {
        return "\nCliente: "
                + this.nome
                + "(" + this.dataAniversario + ")"
                + " - " + this.email;
    }
}
