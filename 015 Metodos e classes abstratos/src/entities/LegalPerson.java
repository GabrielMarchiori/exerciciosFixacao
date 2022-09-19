package entities;

public class LegalPerson extends Person {

    private Integer numberEmployees;

    public LegalPerson() {
        super();
    }

    public LegalPerson(String name, Double annualIncome, Integer numberEmployees) {
        super(name, annualIncome);
        this.numberEmployees = numberEmployees;
    }

    public Integer getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(Integer numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    @Override
    public double tax() {
        double tax = 0;
        if (getNumberEmployees()<=10){
            tax = getAnnualIncome()*0.16;
        }
        else{
            tax = getAnnualIncome()*0.14;
        }
 
        return tax;
    }
    
}
