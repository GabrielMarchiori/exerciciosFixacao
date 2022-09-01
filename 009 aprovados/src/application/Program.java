package application;

import java.util.Locale;
import java.util.Scanner;

import services.Student;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int size = sc.nextInt();
        Student[] gradeStudents = new Student[size];
        
        for(int repeat=0; repeat<gradeStudents.length; repeat++){
            sc.nextLine();
            int numberStudents=repeat+1;
            System.out.println("Digite nome, primeira e segunda nota do "
            +numberStudents+"o aluno:");
            String name = sc.nextLine();
            double firstGrade = sc.nextDouble();
            double secondGrade = sc.nextDouble();
            gradeStudents[repeat] = new Student(name, firstGrade, secondGrade);
        }

        System.out.println("Alunos aprovados:");

        for(int repeat=0; repeat<gradeStudents.length; repeat++){
            if(gradeStudents[repeat].average()>=6){
                System.out.println(gradeStudents[repeat].getName());
            }
        }
        
        sc.close();

    }
    
}
