package Assignment_6;

import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Question_4 {

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int a: arr) {
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        for(int c: map.values()) {
            if(!set.add(c)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Input numbers of elements: ");
        while(x.hasNext()) {
            int m = x.nextInt();
            int[] array = new int[m];
            System.out.println("Input elements: ");
            for (int i = 0; i < m; i++) {
                array[i] = x.nextInt();
            }
            System.out.println("Output: " + uniqueOccurrences(array));
        }
    }
}
