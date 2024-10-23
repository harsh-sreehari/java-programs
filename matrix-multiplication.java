import java.util.*;

public class App {
     public static void main(String[]args){
       int row1,col1,row2,col2,flag=0;

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter no of rows for matrix 1");
       row1 = sc.nextInt();

       System.out.println("Enter no of cols for matrix 1");
       col1 = sc.nextInt();

       System.out.println("Enter no of rows for matrix 2");
       row2 = sc.nextInt();

       System.out.println("Enter no of cols for matrix 2");
       col2 = sc.nextInt();

        //check if multiplication possible
        if (col1 != row2){
            System.out.println("Not Possible");
            flag = 1;
        }
        //enter matrix 1 elements
        int[][] mat1 = new int[row1][col1];
        int[][] mat2 = new int[row2][col2];
        if (flag == 0){
            
            for (int i = 0;i < row1; i++){
                for(int j = 0;j < col1; j++){
                    System.out.println("Enter element for pos "+i+","+j);
                    mat1[i][j] = sc.nextInt();
                }
            }
        }

        //enter martrix 2 elements
        if (flag == 0){
            
            for (int i = 0;i < row2; i++){
                for(int j = 0;j < col2; j++){
                    System.out.println("Enter element for pos "+i+","+j);
                    mat2[i][j] = sc.nextInt();
                }
            }
        }

        //resultant matrix
        int [][]mat3 = new int[row1][col2];

        for(int i = 0; i < row1; i++){
            for(int j = 0; j < col2; j++){
                mat3[i][j] = 0;
                for(int k = 0; k <col1; k++){
                    mat3[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        //print resultant
        for(int i = 0; i < row1; i++){
            for(int j = 0; j < col2; j++){
                System.out.print(mat3[i][j]+" ");
            }
            System.out.println("");
        }

        sc.close();
    }
}
