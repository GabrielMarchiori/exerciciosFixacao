package services;

public class ProductService {

    public static final int TAX = 5; 
    private int accountNumber;
    private String name;
    private double amount;

    public ProductService(int accountNumber, String name, double amount) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.amount = amount;
    }

    public ProductService(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(double deposit){
        amount+=deposit;
    }

    public void withdraw(double withdraw){

        if(withdraw<=amount){
            amount= (amount - withdraw) -TAX;
        }
    }

    public String toString(){
        return "Account " +
                accountNumber +
                ", Holder: " +
                name +
                String.format(", Balance: $ %.2f %n", amount);
    }
    
}
