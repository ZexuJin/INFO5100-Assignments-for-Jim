package Assignment_7;

import java.io.*;
import java.util.Scanner;

public class Question_1 {


    public static void readToBuffer(StringBuffer buffer, String filePath) throws IOException {
        InputStream inputStream = new FileInputStream(filePath);
        String line;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        line = bufferedReader.readLine();
        while (line != null) {
            buffer.append(line);
            buffer.append("\n");
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        inputStream.close();
    }

    public static String readFile(String filePath) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        readToBuffer(stringBuffer, filePath);
        return stringBuffer.toString();
    }

    private static void saveFile(String path, String string) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            bufferedWriter.write(string);
            bufferedWriter.close();
            System.out.println("\nFile created!");
    }


    public static void main(String[] args) throws IOException {
        System.out.println("Please input your file path: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        String line = readFile(path);
        String string[] = line.split(" ");
        String reservedSentence = "";
        for (int i = string.length - 1; i >= 0; i--) {
            reservedSentence = reservedSentence + string[i] + " ";
        }
        System.out.println("Sentence to be reversed: \n");
        System.out.println(line);
        System.out.println("Reversed sentence: ");
        System.out.println(reservedSentence);
        System.out.println("\nPlease enter the file path you'd love to store your reserved sentence: ");
        String path2 = sc.nextLine();
        saveFile(path2, reservedSentence);
    }
}
