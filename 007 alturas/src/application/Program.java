package application;

import java.util.Locale;
import java.util.Scanner;

import services.People;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        People[] iPeople = new People[size];
        

        for(int repeat=0; repeat<size; repeat++){
            sc.nextLine();
            int numberPeople = repeat+1;
            System.out.println("Dados da " + numberPeople + "a pessoa: ");
            
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            iPeople[repeat] = new People(name, age, height);
        }

        double avg = 0;

        for(int repeat=0; repeat<size; repeat++){
            avg += iPeople[repeat].getHeight();
        }
        
        avg /= size;
        System.out.printf("Altura media: %.2f%n", avg);

        double sixteen = 0;

        for(int repeat=0; repeat<size; repeat++){
            if (iPeople[repeat].getAge()<16){
                sixteen++;
            }
        }
        
        sixteen = (sixteen/size)*100;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", sixteen);

        for(int repeat=0; repeat<size; repeat++){
            if (iPeople[repeat].getAge()<16){
                System.out.println(iPeople[repeat].getName());
            }
        }

        sc.close();

    }
    
}
