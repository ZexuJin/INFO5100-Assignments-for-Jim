package Question_2;
import java.util.Scanner;

public class Number {
    public static void count(int dividend, int divisor){
        try{
            int result = dividend / divisor;
            System.out.println("The result of "+dividend+" divided by "+divisor+" is "+result);
        }
        catch (ArithmeticException e){
            System.out.println("Error:"+e.getMessage());
            System.out.println("Error:"+e.toString());
        }
    }

    public static void main(String args[]){
        Scanner KB=new Scanner(System.in);
        System.out.println("Please enter dividend:");
        int dividend = KB.nextInt();
        System.out.println("Please enter divisor:");
        int divisor = KB.nextInt();
        count(dividend, divisor);
    }
}
