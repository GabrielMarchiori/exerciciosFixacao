import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Quantos numeros vai digitar? ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        if (size>10){
            System.out.println("numero maximo 10");
        }

        else{

            for(int repeat=0; repeat<size; repeat++){
                System.out.print("Digite um numero: ");           
                numbers[repeat] = sc.nextInt();
            }

            System.out.println("NUMEROS NEGATIVOS:");
            
            for(int repeat=0; repeat<size; repeat++){
                if (numbers[repeat]<0){
                    System.out.println(numbers[repeat]);
                }
            }
        }
        sc.close();

    }
}
