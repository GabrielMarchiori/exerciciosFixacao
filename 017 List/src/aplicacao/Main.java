package aplicacao;

import utilitarios.Empregados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos empregados deseja registrar?");
        int quantidade = sc.nextInt();

        List<Empregados> empregados = new ArrayList<>();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Empregado #" + (i+1));
            System.out.printf("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();

            //valida de o id é repetido
            for (Empregados empregado : empregados) {
                while (empregado.getId().equals(id)){
                    System.out.printf("Valor de ID repetido digite outro id: ");
                    id = sc.nextInt();
                    sc.nextLine();
                }
            }

            System.out.printf("Nome: ");
            String nome = sc.nextLine();

            System.out.printf("Salario: ");
            Double salario = sc.nextDouble();

            empregados.add(new Empregados(id, nome, salario));
        }

        System.out.printf("Entre com o id do empregado que deseja aumentar o salario:");
        int aumento = sc.nextInt();
        sc.nextLine();

        int contador = 0;
        do {
            for (Empregados empregado : empregados) {
                contador = 1;
                if (empregado.getId().equals(aumento)){
                    System.out.printf("Entre com a porcentagem do aumento:");
                    int porcentagem = sc.nextInt();
                    sc.nextLine();
                    empregado.aumento(porcentagem);
                }else{
                    contador++;
                }
                if (contador == quantidade){
                    System.out.println("esse id nao existe");
                }
            }
        }while (contador == quantidade);

        for (Empregados empregado : empregados) {
            System.out.println(empregado.toString());
        }

        sc.close();
    }

}
