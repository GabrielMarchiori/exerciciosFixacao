package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        Student student = new Student();

        student.name=sc.nextLine();
        student.note1=sc.nextDouble();
        student.note2=sc.nextDouble();
        student.note3=sc.nextDouble();

        System.out.println(student.finalGrade());

        sc.close();     

    }
}