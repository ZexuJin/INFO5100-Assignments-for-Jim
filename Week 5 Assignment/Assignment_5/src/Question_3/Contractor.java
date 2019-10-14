package Question_3;

public class Contractor extends Employee{
    private int workingHours;

    public Contractor(String name, int paymentPerHour, int workingHours){
        super(name,paymentPerHour);
        this.workingHours = workingHours;
    }

    public int calculateSalary(){
        int paymentPerHour = getPaymentPerHour();
        int salaryInTotal = this.workingHours * paymentPerHour;
        return salaryInTotal;
    }
}
