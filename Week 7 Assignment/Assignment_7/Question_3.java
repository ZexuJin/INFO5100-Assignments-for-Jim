package Assignment_7;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_3 {

    public static ArrayList<String> getFiles(String path) {
        ArrayList<String> files = new ArrayList<>();
        File file = new File(path);
        File[] tempList = file.listFiles();

        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isFile()) {
                files.add(tempList[i].toString());
            }
        }
        return files;
    }

    private static void countLines(String fileName) {
        BufferedReader bufferedReader;
        int lineCount;
        try {
            bufferedReader = new BufferedReader(new FileReader(fileName));
        } catch (Exception e) {
            System.out.println("Error: Can't open file.");
            return;
        }
        lineCount = 0;
        try {
            String line = bufferedReader.readLine();
            while (line != null) {
                lineCount++;
                line = bufferedReader.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error: Problem with reading from file.");
            return;
        }
        System.out.println(lineCount + " lines");
    }


    public static void main(String[] args) {

        System.out.println("Please input the path of the files: ");
        Scanner sc = new Scanner(System.in);
        String mainPath = sc.nextLine();
        ArrayList<String> files = getFiles(mainPath);

        System.out.println("The count of lines of each file: ");
        for (int i = 0; i < files.size(); i++) {
            System.out.print(files.get(i)+ ": ");
            countLines(files.get(i));
        }
    }
}
