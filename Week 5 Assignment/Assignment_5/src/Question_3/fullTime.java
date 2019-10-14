package Question_3;

public class fullTime extends Employee{

    public fullTime(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    public int calculateSalary() {
        int paymentPerHour = getPaymentPerHour();
        int salaryInTotal = 22 * 8 * paymentPerHour;
        return salaryInTotal;
    }
}
