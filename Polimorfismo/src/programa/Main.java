package programa;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

        List<Produto> produtos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a quantidade de produtos que deseja adicionar: ");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.println("Digite o produto " + (i + 1) + ": ");
            System.out.printf("Comum, usado ou importado (c/u/i)?");
            Character c = sc.next().charAt(0);
            sc.nextLine();

            System.out.printf("Nome: ");
            String nome = sc.nextLine();
            System.out.printf("Preco: ");
            Double valor = sc.nextDouble();
            sc.nextLine();

            if (c == 'c') {
                produtos.add(new Produto(nome, valor));
            } else if (c == 'u') {
                System.out.printf("Data da fabricacao: ");
                String dataDigitada = sc.nextLine();
                Date data = dataFormatada.parse(dataDigitada);
                produtos.add(new ProdutoUsado(nome, valor, data));
            } else if (c == 'i') {
                System.out.printf("Taxa Alfandegaria: ");
                Double taxaAlfandegaria = sc.nextDouble();
                produtos.add(new ProdutoImportado(nome, valor, taxaAlfandegaria));
            }
        }

        for (Produto produto : produtos) {
            System.out.println(produto.etiquetaPreco());
        }

    }
}
