package entities;

public class PhysicalPerson extends Person {

    private Double healthSpending;

    public PhysicalPerson() {
        super();
    }


    public PhysicalPerson(String name, Double annualIncome, Double healthSpending) {
        super(name, annualIncome);
        this.healthSpending = healthSpending;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }


    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

    @Override
    public double tax() {
        
        double tax=0;
        if (getAnnualIncome()<20000){
            tax = getAnnualIncome()*0.15;
            if(getHealthSpending()>0){
                tax-=getHealthSpending()*0.50;
            }
        }
        else {
            tax = getAnnualIncome()*0.25;
            if(getHealthSpending()>0){
                tax-=getHealthSpending()*0.50;
            }
        }
        return tax;
    }
    
}
