package modelo.enums;

public enum StatusServico {
    PAGAMENTO_PENDENTE("Pagamento Pendente"),
    PROCESSANDO("Processando"),
    ENVIADO("Enviado"),
    ENTREGUE("Entregue");

    private String nome;

    StatusServico(String nome) {
        this.nome = nome;
    }

    public static StatusServico tipoStatusServico(String nome) {
        for (StatusServico servico : StatusServico.values()) {
            if (servico.nome.equalsIgnoreCase(nome)) {
                return servico;
            }
        }
        return null;
    }
}
