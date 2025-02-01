import java.util.Scanner;

public class Transpose_Of_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows of array: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns of array: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print("Enter element for index "+ "("+(i+1)+","+(j+1)+") : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Transpose of Matrix: ");
        for(int j = 0; j < cols; j++){
            for(int i = 0; i < rows; i++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
