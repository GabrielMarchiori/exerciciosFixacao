package programa;

import entidade.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Conta conta = new Conta(300.00, 8021, 500.00, "Bob Brown");
        System.out.printf("Entre com a quantidade que deseja sacar: ");
        double quantidade = sc.nextDouble();

        try {
            conta.saque(quantidade);
            System.out.println(conta.toString());
        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
