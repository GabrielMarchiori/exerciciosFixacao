package application;

import java.util.Scanner;

import services.Rooms;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner (System.in);

        System.out.print("How many rooms will be rented? ");
        int size=sc.nextInt();
        Rooms[] boardingHouse = new Rooms[10];

        for(int repeat=0; repeat<size; repeat++){
            sc.nextLine();
            int rents=repeat+1;
            System.out.println();
            System.out.println("Rent #"+rents+":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            
            int repeat2=0;
            int room=0;
            do{
                if(repeat2>0){
                    System.out.println();
                    System.out.println("Occupied room re-enter");
                }
                System.out.print("Room: ");
                room = sc.nextInt();

                repeat2+=1;              
            }while(boardingHouse[room]!=null);
                boardingHouse[room]= new Rooms(name, email);
            
        }

        System.out.println(  );
        System.out.println("Busy rooms:");

        for(int repeat=0; repeat<10; repeat++){
            if(boardingHouse[repeat]!=null){
                System.out.println(repeat+": "+boardingHouse[repeat]);
            }
        }

        sc.close();

    }
}
