package application;

import java.util.Scanner;

import services.BoardingHouse;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner (System.in);

        System.out.print("How many rooms will be rented? ");
        int size=sc.nextInt();
        BoardingHouse[] rooms = new BoardingHouse[10];

        for(int repeat=0; repeat<size; repeat++){
            sc.nextLine();
            int rents=repeat+1;
            System.out.println();
            System.out.println("Rent #"+rents+":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int room = sc.nextInt();
            rooms[room]= new BoardingHouse(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");

        for(int repeat=0; repeat<10; repeat++){
            if(rooms[repeat]!=null){
                System.out.println(repeat+": "+rooms[repeat]);
            }
        }

        sc.close();

    }
}
