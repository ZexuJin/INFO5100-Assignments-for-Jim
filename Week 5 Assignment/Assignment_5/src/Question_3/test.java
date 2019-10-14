package Question_3;

public class test {
    public static void main(String args[]){
        Contractor Alice = new Contractor("Alice", 35, 200);
        fullTime Jack = new fullTime("Jack", 30);
        System.out.println("The monthly salary for Contractor Alice is $" + Alice.calculateSalary());
        System.out.println("The monthly salary for full time employee Jack is $"+ Jack.calculateSalary());
    }
}
