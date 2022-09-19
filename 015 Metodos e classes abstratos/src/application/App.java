package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Person> taxes = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int quantity = sc.nextInt();

        for(int repeat=1; repeat<=quantity; repeat++){
            System.out.println("Tax payer #"+ repeat + " data:");
            
            System.out.print("Individual or company (i/c)? ");
            char option = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            Double annualIncome = sc.nextDouble();

            if(option == 'i'){
                System.out.print("Health expenditures: ");
                Double healthSpending = sc.nextDouble();
                taxes.add(new PhysicalPerson(name, annualIncome, healthSpending));
            }

            else{
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();
                taxes.add(new LegalPerson(name, annualIncome, numberEmployees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID: ");

        for(Person list : taxes){
            System.out.println(list);
        }
        
        double soma=0;

        for(Person list : taxes){
           soma+= list.tax();
        }
        System.out.println("TOTAL TAXES: $ "+ String.format("%.2f", soma));


        sc.close();

    }
}
