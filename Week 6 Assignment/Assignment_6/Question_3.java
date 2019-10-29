package Assignment_6;

import java.util.Arrays;
import java.util.Scanner;

public  class Question_3 {
    public static boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        if(sLength != tLength) {
            return false;
        }
        char[] sToString = s.toCharArray();
        Arrays.sort(sToString);
        char[] tToString = t.toCharArray();
        Arrays.sort(tToString);
        return Arrays.equals(sToString,tToString);
    }


    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Please input S:");
        String s = Scan.nextLine();
        System.out.println("Please input T:");
        String t = Scan.nextLine();
        System.out.println("Output:" + isAnagram(s,t));
    }
}
