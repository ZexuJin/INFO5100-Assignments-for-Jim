package Assignment;

/**
 * Submit it on or before 22nd September 2019 , 12:00 pm
 */
import java.util.Scanner;
public class Assignment2 {
    private Employee employee;

    /*
            This method should return the sum of salaries of employees having salary greater than 5000
            Note: Employee array is passed, not employee
         */
    public double salaryGreaterThanFiveThousand(Employee[] employees) {
        double sum = 0.0;
        for(Employee e : employees){
            double salary = e.getSalary();
            if (salary > 5000){
                sum =sum + salary;
            }
        }
        return sum;
    }


    /*
        This method should print either "Fizz", "Buzz" or "FizzBuzz"
        "Fizz" - if id of employee is divisible by 3
        "Buzz" - if id of employee is divisible by 5
        "FizzBuzz" - if id of employee is divisible by both 3 and 5
     */
    public void fizzBuzz(Employee employee) {
        // @TODO
        int id = employee.getId();
        if (id % 3 == 0 && id % 5 != 0) {
            System.out.println("Fizz");
        }
        if (id % 3 != 0 && id % 5 == 0) {
            System.out.println("Buzz");
        }
        if (id % 3 == 0 && id % 5 == 0) {
            System.out.println("FizzBuzz");
        }
        if (id % 3 != 0 && id % 5 != 0) {
            System.out.println("None!");
        }
    }

    /*
        This method should calculate tax for an employee in dollars
        If salary of employee is less than or equal to 2500, tax should be 10%
        If salary of employee is greater than 2500 but less than or equal to 5000, tax should be 25%
        If salary of employee is greater than 5000, tax should be 35%
    */
    public double calculateTax(Employee employee) {
        // @TODO
        double salary = employee.getSalary();
        double tax;
        if (salary <= 2500) {
            tax = 0.1 * salary;
        }
        else if (salary <= 5000) {
            tax = 0.25 * salary;
        }
        else {
            tax = 0.35 * salary;
        }

        return tax;
    }
    
    
    /*
        We are given two employee objects.
        Implement this method to swap salaries of employees
    */
    public void swap(Employee firstEmployee, Employee secondEmployee) {
        // @TODO
        double salaryFirst = firstEmployee.getSalary();
        double salarySecond = secondEmployee.getSalary();
        salaryFirst = salaryFirst + salarySecond;
        salarySecond = salaryFirst - salarySecond;
        salaryFirst = salaryFirst - salarySecond;
    }

    
    /*
        Return number of employees whose age is greater than 50
        Note: Employee array is passed, not employee
     */
    public int employeesAgeGreaterThan50(Employee[] employees) {
        // @TODO
        int numbAgeOver50 = 0;
        for (Employee e : employees){
            int age = e.getAge();
            if (age > 50){
                numbAgeOver50 ++;
            }
        }
        return numbAgeOver50;
    }

    
    /*
        Implement this method to reverse firstName of employee.
        Ex. Before: employee.getFirstName() -> "John"
        After : employee.getFirstName() -> "nhoJ"
     */
    public void reverseFirstName(Employee employee) {
        // @TODO
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input new first name:");
        while(true){
            String newFirstName = scan.nextLine();
            employee.setFirstName(newFirstName);
            System.out.println("The first name has changed to "+newFirstName);
        }
    }

    
    /*
        Print "true" if employee's first name contain one or more digits
        Print "false" if employee's first name doesn't contain any digit
        Ex: employee.getFirstName() -> "ha8l" == true
        employee.getFirstName() -> "hail" == false
     */
    public boolean isContainDigit(Employee employee) {
        // @TODO
        String name = employee.getFirstName();
        char[] name1 = name.toCharArray();
        for (int i = 0; i < name1.length; i++) {
            if (Character.isDigit(name1[i])) {
                return true;
            }
        }
        return false;
    }



    
     /*
        Write a method to raise an employee's salary to three times of his/her original salary.
        Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
        DO NOT change the input in this method.
        Try to add a new method in Employee class: public void raiseSalary(double byPercent) 
        Call this new method.
     */
    public void tripleSalary(Employee employee) {
        // @TODO
        employee.raiseSalary(200);
    }
    
    
    //Additional question for extra credit
    /*
        Implement this method to convert String[] to employees array.
        Ex: String[] employees = new String[]{"1,John,24,7500", "2,Hail,28,7899.90"};
        This String array of length 2 contains 2 employees in form of string, where
        id = 1
        firstName=John
        age=24
        salary=7500
        convert each string to employee object.
        Hint: Use String methods. Refer : https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     */
    public Employee[] createEmployees(String[] employeesStr) {
        Employee[] employees = new Employee[employeesStr.length];
        // @TODO
        return employees;
    }
}
