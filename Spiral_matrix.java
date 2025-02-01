import java.util.Scanner;

public class Spiral_matrix {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter row of array: ");
         int n = sc.nextInt();
         System.out.print("Enter colunm of array: ");
         int m = sc.nextInt();

         int matrix[][] = new int[n][m];

         for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print("Enter element for index "+"("+(i+1)+","+(j+1)+") : ");
                matrix[i][j] = sc.nextInt();
            }
         }
         System.out.println("Matrix: ");
         for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
         }
         System.out.println("");
         System.out.println("Spiral Matrix: ");
         int rowStart = 0;
         int rowEnd = n - 1;
         int colStart = 0;
         int colEnd = m - 1;

         while(rowStart <= rowEnd && colStart <= colEnd) {
            //1
            for(int col=colStart; col <= colEnd; col++) {
            System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;
            //2
            for(int row=rowStart; row <= rowEnd; row++) {
            System.out.print(matrix[row][colEnd] +" ");
            }
            colEnd--;
            //3
            if(rowStart <= rowEnd){
            for(int col=colEnd; col >= colStart; col--) {
            System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;
        }
            //4
            if(colStart <= colEnd){
            for(int row=rowEnd; row>=rowStart; row--) {
        
            System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;
        }
            
            }
         

        }
}
