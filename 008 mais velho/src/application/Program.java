package application;

import java.util.Scanner;

import services.People;

public class Program {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas voce vai digitar? ");
        int size = sc.nextInt();
        People[] iPeople = new People[size];

        for(int repeat=0; repeat<iPeople.length; repeat++){
            sc.nextLine();
            int numberPeople = repeat+1;
            System.out.println("Dados da "+numberPeople+"a pessoa:");
            String name = sc.nextLine();
            int age = sc.nextInt();
            iPeople[repeat] = new People(name, age);
        }

        int moreOldPosition=0;
        int moreOldAge=0;

        for(int repeat=0; repeat<iPeople.length; repeat++){
            
            if(iPeople[repeat].getAge()>moreOldAge){
                moreOldAge = iPeople[repeat].getAge();
                moreOldPosition=repeat;
            }
            
        }

        System.out.println("PESSOA MAIS VELHA: " + iPeople[moreOldPosition].getName());
        sc.close();

    }

}