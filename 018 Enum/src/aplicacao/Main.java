package aplicacao;

import modelo.entidades.Cliente;
import modelo.entidades.OrdemItem;
import modelo.entidades.OrdemServico;
import modelo.entidades.Produto;
import modelo.enums.StatusServico;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre cliente data:");
        System.out.printf("Nome: ");
        String nome = sc.nextLine();

        System.out.printf("Email: ");
        String email = sc.next();
        sc.nextLine();

        System.out.printf("Data de aniversario (DD/MM/YYYY): ");
        String dataAniversarioString = sc.nextLine();
        Date dataAniversario = formatoData.parse(dataAniversarioString);

        System.out.println();
        System.out.println("Enter order data:");

        System.out.printf("Status: ");
        String status = sc.next();

        System.out.printf("Quantos item serao adicionados a essa ordem de servico? ");
        int x = sc.nextInt();
        sc.nextLine();

        OrdemServico os = new OrdemServico(new Date(), StatusServico.valueOf(status), new Cliente(nome, email, dataAniversario));

        for (int i = 0; i < x; i++) {
            System.out.println("Entre com o item #" + (1+i));

            System.out.printf("Nome do produto: ");
            String produto = sc.nextLine();

            System.out.printf("Preco produto: ");
            Double preco = sc.nextDouble();

            System.out.printf("Quantidade: ");
            Integer quantidade = sc.nextInt();
            sc.nextLine();

            OrdemItem ordemItem = new OrdemItem(quantidade, new Produto(produto, preco));
            os.adcItem(ordemItem);
        }

        System.out.println(os.toString());
        for (OrdemItem ordemItem : os.getOrdemItems()) {
            System.out.println(ordemItem.toString());
        }

        System.out.println("Preco total: R$" + String.format("%.2f", os.total()));


        sc.close();
    }
}
