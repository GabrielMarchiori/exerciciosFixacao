import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int sizeLine = sc.nextInt();
        int sizeColumns = sc.nextInt();
        int[][] mat = new int[sizeLine][sizeColumns];

        for(int repeatLine=0; repeatLine<mat.length; repeatLine++){
            for(int repeatColumns=0; repeatColumns<mat[repeatLine].length; repeatColumns++){
                mat[repeatLine][repeatColumns]=sc.nextInt();
            }
        }
        
        int localeNumber = sc.nextInt();

        for(int repeatLine=0; repeatLine<mat.length; repeatLine++){
            for(int repeatColumns=0; repeatColumns<mat[repeatLine].length; repeatColumns++){
                if (mat[repeatLine][repeatColumns]==localeNumber){
                    System.out.println("Position "+repeatLine+","+repeatColumns+":");
                    if(repeatColumns>0){
                        System.out.println("Left: "+mat[repeatLine][repeatColumns-1]);
                    }
                    if(repeatLine>0){
                        System.out.println("Up: "+mat[repeatLine-1][repeatColumns]);
                    }
                    if(repeatColumns<mat.length){
                        System.out.println("Right: "+mat[repeatLine][repeatColumns+1]);
                    }
                    if(repeatLine<mat[repeatLine].length){
                        System.out.println("Down: "+mat[repeatLine+1][repeatColumns]);
                    }
                    
                }
            }
        }
        sc.close();


    }
}
