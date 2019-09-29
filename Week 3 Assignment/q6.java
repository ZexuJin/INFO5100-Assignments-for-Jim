package Assignment3;

public class q6 {

    public static String reverseString(String input) {
        if (input == null || input == " "){
            System.out.println("You're putting in a empty string!");
            return null;
        }
        else{
            int i;
            StringBuilder stringBuilder = new StringBuilder();
            String[] inputString = input.split(" ");

            for (i = inputString.length - 1 ; i>= 0; i--)
            {
                stringBuilder.append(inputString[i]);
                stringBuilder.append(" ");
            }
            String outputString = stringBuilder.toString();
            return outputString;
        }
    }

    public static void main(String[] args){
        String s = "I am hungry";
        System.out.println("The reverse version is --> "+reverseString(s));
    }
}
