package Assignment_4.question4;

public class q4{

    static void matrixMulti(int[][]a,int[][]b){
        int c[][] = new int[a.length][b[0].length];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b[0].length; j++){
                int temp = 0;
                for(int k = 0; k < b.length; k++){
                    temp+=a[i][k] * b[k][j];
                }
                c[i][j] = temp;
            }
        }

        for(int m = 0; m < a.length; m++){
            for(int n = 0; n < b[0].length; n++){
                System.out.print(c[m][n] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][]a={{1,1,0},{-1,0,3}};
        int[][]b={{7,0,0},{0,0,0},{0,0,1}};
        System.out.println("The multiplication of those two matrix is:");
        matrixMulti(a,b);
    }
}
