package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp01 = new Employee();

        System.out.print("Name:");
        emp01.name = sc.nextLine();
        
        System.out.print("Gross salary:");
        emp01.grossSalary = sc.nextDouble();

        System.out.print("Tax:");
        emp01.tax = sc.nextDouble();

        System.out.println("Employee: " + emp01);

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp01.increaseSalary(percentage);

        System.out.println("Updated data: " + emp01);

        sc.close();
    }
}
