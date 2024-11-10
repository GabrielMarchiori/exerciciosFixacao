package modelo.entidades;

import modelo.enums.StatusServico;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdemServico {
    private Date momento;
    private StatusServico status;

    private Cliente cliente;
    private List<OrdemItem> ordemItems = new ArrayList<>();

    public OrdemServico(Date momento, StatusServico status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public StatusServico getStatus() {
        return status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<OrdemItem> getOrdemItems() {
        return ordemItems;
    }

    public void adcItem(OrdemItem item){
        ordemItems.add(item);
    }

    public void delItem(OrdemItem item){
        ordemItems.remove(item);
    }

    public Double total(){
        Double soma = (double) 0;
        for (OrdemItem oI : ordemItems) {
            soma+= oI.subTotal();
        }
        return soma;
    }

    @Override
    public String toString() {

        return "Resumo da OS: \n"
                + "Criacao da OS: "
                + getMomento()
                + "\nStatus OS: "
                + this.getStatus()
                + this.cliente.toString()
                + "\nOS itens:";
    }
}
