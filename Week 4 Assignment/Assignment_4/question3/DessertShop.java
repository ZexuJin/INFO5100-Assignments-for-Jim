package Assignment_4.question3;

public class DessertShop {
    public static double taxRate = 6.5;
    public static String storeName = "M & M Dessert Shop";

    public static String cents2dollarsAndCents(int cents){
        String s = "";
        if(cents < 0) {
            System.out.println("The number cannot be negative number.");
        } else {
            int numberOfDollars = cents / 100;
            int numberOfCents = cents % 100;
            if(numberOfDollars == 0){
                s = s + "0";
            }
            else{
                String numberOfDollarsString = new Integer(numberOfDollars).toString();
                s = s + numberOfDollarsString;
            }
            s = s + ".";
            if(cents < 10){
                s = s + "0";
            }
            String numberOfCentsString = new Integer(numberOfCents).toString();
            s = s + numberOfCentsString;
        }
        return s;
    }
}
