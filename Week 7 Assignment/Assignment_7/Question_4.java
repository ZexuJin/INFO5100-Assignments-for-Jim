package Assignment_7;

import java.util.Random;

public class Question_4 {

    /*generate array of random numbers*/
    static void generateRandomArray(int[] arr) {
        Random rd = new Random(); // creating Random object
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
    }

    /*get sum of an array using 4 threads*/
    static long sum(int[] arr){

        return 0;
    }

    public static void main(String[] args){
        int[] arr = new int[4000000];
        generateRandomArray(arr);
        long sum = sum(arr);
        System.out.println("Sum: " + sum);
    }
}
