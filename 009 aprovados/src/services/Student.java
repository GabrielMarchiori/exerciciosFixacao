package services;

public class Student {
    
    private String name;
    private double firstGrade;
    private double secondGrade;


    public Student(String name, double firstGrade, double secondGrade) {
        this.name = name;
        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;
    }


    public String getName() {
        return this.name;
    }

    public double getFirstGrade() {
        return this.firstGrade;
    }


    public void setFirstGrade(double firstGrade) {
        this.firstGrade = firstGrade;
    }


    public double getSecondGrade() {
        return this.secondGrade;
    }


    public void setSecondGrade(double secondGrade) {
        this.secondGrade = secondGrade;
    }

    public double average(){
        return (this.firstGrade+this.secondGrade)/2;
    }

    


    

}
