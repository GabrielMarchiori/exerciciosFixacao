package aplicacao;

import entidades.Pessoa;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        Scanner sc = new Scanner(System.in);

        System.out.printf("Entre com o numero de contribuintes: ");
        int contribuintes = sc.nextInt();

        for (int i = 0; i < contribuintes; i++) {
            System.out.println("Dados do contribuinte #" + (i+1) + ":");
            System.out.printf("Pessoa fisica ou juridica (f/j)? ");
            char opcao = sc.next().charAt(0);

            System.out.printf("Nome: ");
            String nome = sc.next();

            System.out.printf("Renda anual: ");
            Double renda = sc.nextDouble();

            switch (opcao) {
                case 'f':
                    System.out.printf("Gastos hospitalar: ");
                    Double gastosHospitalar = sc.nextDouble();
                    pessoas.add(new PessoaFisica(nome, renda, gastosHospitalar));
                    break;
                    case 'j':
                        System.out.printf("Numero de colaboradores: ");
                        int numeroDeColaboradores = sc.nextInt();
                        pessoas.add(new PessoaJuridica(nome, renda, numeroDeColaboradores));
                        break;
            }
        }

        double total = 0;
        System.out.println("Imposto a pagar");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
            total += pessoa.imposto();
        }

        sc.nextLine();
        System.out.println(String.format("Total de imposto: R$%.2f", total));
        sc.close();
    }
}
