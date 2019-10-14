package Question_4;
import java.util.Scanner;

public class MyIndexOutOfBoundException extends RuntimeException {
    private int lowerBound;
    private int upperBound;
    private int index;

    public MyIndexOutOfBoundException(int lowest, int highest, int current) {
        this.lowerBound = lowest;
        this.upperBound = highest;
        this.index = current;
    }

    public String toString() {
        return "Error Message: Index: " + index + ", but Lower bound: "
                + this.lowerBound + ", Upper Bound: " + this.upperBound;
    }

    public static void IndexTest(int boundRange, int testIndex) {
        try {
            System.out.println("Try to access the number with index: " + testIndex);
            if (testIndex >= boundRange)
                throw new MyIndexOutOfBoundException(0, boundRange - 1, testIndex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        Scanner KB = new Scanner(System.in);
        System.out.println("Please enter bound range:");
        int boundRange = KB.nextInt();
        System.out.println("Please enter index:");
        int testIndex = KB.nextInt();
        IndexTest(boundRange, testIndex);
    }
}