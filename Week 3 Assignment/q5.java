package Assignment3;

public class q5 {

    public static String countAndSay(int n) {
        if (n < 1 || n > 30){
            System.out.println("You're putting the wrong number. The number should between 1 and 30.");
            return null;
        }

        String resultofNumbers = "1";

        for(int i = 1; i < n; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            int count = 1;
            for (int j = 1; j < resultofNumbers.length(); j++) {
                if (resultofNumbers.charAt(j) == resultofNumbers.charAt(j - 1)) {
                    count++;
                }
                else {
                    stringBuilder.append(count);
                    stringBuilder.append(resultofNumbers.charAt(j - 1));
                    count = 1;
                }
            }
            stringBuilder.append(count);
            stringBuilder.append(resultofNumbers.charAt(resultofNumbers.length() - 1));
            resultofNumbers = stringBuilder.toString();
        }
        return resultofNumbers;
    }

    public static void main(String[] args){
        int n = 4;
        System.out.println("The result is "+countAndSay(n));
    }
}

