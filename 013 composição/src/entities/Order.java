package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import status.EnumOrderStatus;

public class Order {
    
    private LocalDateTime moment;

    private EnumOrderStatus status;

    private List<OrderItem> orderItens = new ArrayList<>();
    private Client client;
    
    
    public Order() {
    }


    public Order(LocalDateTime moment, EnumOrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }


    public LocalDateTime getMoment() {
        return moment;
    }


    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }


    public EnumOrderStatus getStatus() {
        return status;
    }


    public void setStatus(EnumOrderStatus status) {
        this.status = status;
    }


    public List<OrderItem> getOrderItens() {
        return orderItens;
    }


    public Client getClient() {
        return client;
    }


    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem orderItem){
        orderItens.add(orderItem);
    }

    public void removeItem(OrderItem orderItem){
        orderItens.remove(orderItem);
    }

    public Double total(){
        Double sum = 0.0;
        for (OrderItem i : orderItens){
            sum+= i.subTotal();
        }
        return sum;
    }


}
