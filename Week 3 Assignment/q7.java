package Assignment3;

import java.util.ArrayList;

public class q7 {
    public static int[] spiralOrder(int[][] matrix){
        if(matrix == null || matrix.length == 0){
            System.out.println("There's something wrong with the input matrix, please check out");
            return null;
        }
        else{
            int row = matrix.length;
            int column = matrix[0].length;
            ArrayList<Integer> resultList = new ArrayList<>(row*column);
            int startRow = 0;
            int endRow = row -1;
            int startColumn = 0;
            int endColumn = column - 1;

            while(startRow <= endRow && startColumn <= endColumn){

                //Start travelling through the start row, from left to right.
                if(startRow <= endRow && startColumn <= endColumn){
                    for(int i = startColumn; i <= endColumn; i++){
                        resultList.add(matrix[startRow][i]);
                    }
                    startRow = startRow + 1;
                }

                //Start travelling through the last column, from top to bottom.
                if(startRow <= endRow && startColumn <= endColumn){
                    for(int i = startRow; i <= endRow; i++){
                        resultList.add(matrix[i][endColumn]);
                    }
                    endColumn = endColumn - 1;
                }

                //Start travelling through the last row, from right to left.
                if(startRow <= endRow && startColumn <= endColumn){
                    for(int i = endColumn; i >= startColumn; i--){
                        resultList.add(matrix[endRow][i]);
                    }
                    endRow = endRow - 1;
                }

                //start travelling through the first column, from bottom to top.
                if(startRow <= endRow && startColumn <= endColumn){
                    for(int i = endRow; i >= startRow; i--){
                        resultList.add(matrix[i][startColumn]);
                    }
                    startColumn = startColumn + 1;
                }
            }
            int size = resultList.size();
            int[] result = new int[size];
            for(int j = 0; j < size; j++){
                result[j] = resultList.get(j);
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[] s = spiralOrder(matrix);
        for(int i : s)
            System.out.print(i+" ");
    }
}
