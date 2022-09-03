package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("How many employees will be registered? ");
        int size=sc.nextInt();

        List<Employees> employees = new ArrayList<>();

        for(int repeat=0; repeat<size; repeat++){
            System.out.println();
            System.out.println("Employee #"+(repeat+1)+":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            employees.add(new Employees(id, name, salary));
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int promotion = sc.nextInt();
        //chamando a função
        Integer position = verificationId(employees, promotion);

        if(position!= null){
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            employees.get(position).promotion(percentage);
        }
        else{
            System.out.println("This id does not exist!");
        }

        System.out.println("List of employees: ");
        for(int repeat=0; repeat<employees.size(); repeat++){
            System.out.println(employees.get(repeat));
        }


        sc.close();
       
    }

    public static Integer verificationId (List<Employees> employees, double promotion){
        for (int position=0; position<employees.size(); position++) {
            if(employees.get(position).getId()== promotion){
                return position;
            }
           
        }
        return null;
    }
}
