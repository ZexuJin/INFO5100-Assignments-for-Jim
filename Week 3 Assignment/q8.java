package Assignment3;

public class q8 {
    public static String convert(String s, int numRows) {
        if(numRows < 1 || s == null || s == " ")
            return null;
        else if (numRows == 1){
            return s;
        }
        else{
            StringBuilder stringBuilder = new StringBuilder();
            int length = s.length();

        }

        StringBuilder stringBuilder = new StringBuilder();
        int n = s.length();
        //"itemsPerSet" meaning the number of items in one set that can help build pattern.
        int itemsPerSet = numRows * 2 - 2;
        int cycleLen = 2 * numRows - 2;
        for(int i = 0; i < numRows; i++){
            //Put items in first row into the new stringBuilder.
            if( i == 0 ){
                for(int j = i; j < s.length(); j = j + itemsPerSet){
                    stringBuilder.append(s.charAt(j));
                }
            }

            //Put items in middle rows into the new stringBuilder.
            //Items in middle row can be divided into two different types that can form two different set of patterns.
            if( i > 0 && i < numRows - 1){
                int j = i;
                boolean isFirstPattern = true;
                int itemsPerSet1 = 2 * (numRows - 1 - i);  //the first set of pattern.
                int itemsPerSet2 = itemsPerSet - itemsPerSet1;  //the second set of pattern.
                while (j < s.length()) {
                    stringBuilder.append(s.charAt(j));
                    if (isFirstPattern){
                        j = j + itemsPerSet1;
                    }
                    else{
                        j = j + itemsPerSet2;
                    }
                    isFirstPattern = !isFirstPattern;
                }
            }

            //put items in the last row into new stringBuilder.
            if (i == numRows - 1){
                for(int j = i; j < s.length(); j = j + itemsPerSet){
                    stringBuilder.append(s.charAt(j));
                }
            }
        }
         String sAfterConvert = stringBuilder.toString();
        return sAfterConvert;
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        String sAfterConvert = convert(s,3);
            System.out.print("The result is --> "+sAfterConvert);
    }
}
