package entities;

public class Student {
    
    public String name;
    public double note1;
    public double note2;
    public double note3;

    public String finalGrade (){

        double finalNote = note1 + note2 + note3;

        if (finalNote<60){
            double missing = 60-finalNote;

            return "FINAL GRADE = "
                    + String.format("%.2f%n", finalNote)
                    + String.format("FAILED %n")
                    + "MISSING "
                    + String.format("%.2f", missing)
                    + " POINTS";
        }

        else {

            return "FINAL GRADE = "
                        + String.format("%.2f%n", finalNote)
                        + "PASS";
        }
    }

}
