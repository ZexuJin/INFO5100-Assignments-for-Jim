package Assignment_7;

import java.util.Scanner;
import java.util.Stack;

public class Question_2 {
    public static String decodeString(String string) {
        String decode = "";
        Stack<Integer> countStack = new Stack<>();
        Stack<String> outputStack = new Stack<>();
        int index = 0;
        while (index < string.length()) {
            if (Character.isDigit(string.charAt(index))) {
                int count = 0;
                while (Character.isDigit(string.charAt(index))) {
                    count = 10 * count + (string.charAt(index) - '0');
                    index++;
                }
                countStack.push(count);
            }
            else if (string.charAt(index) == '[') {
                outputStack.push(decode);
                decode = "";
                index++;
            }
            else if (string.charAt(index) == ']') {
                StringBuilder temp = new StringBuilder (outputStack.pop());
                int repeatTimes = countStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(decode);
                }
                decode = temp.toString();
                index++;
            }
            else {
                decode = decode + string.charAt(index++);
            }
        }
        return decode;
    }

    public static void main(String[] args){
        System.out.println("Please input your string code: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Output: \n"+ decodeString(s));
    }
}
