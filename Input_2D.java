import java.util.Scanner;

public class Input_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows of array: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns of array: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        //input
        //rows
        for(int i = 0; i < rows; i++){
            //columns
            for(int j = 0; j < cols; j++){
                System.out.print("Enter element for "+"("+ (i + 1) + "," + (j + 1) + ") : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(matrix[i][j]+" " );
            }
            System.out.println(" ");
        }
    }
}
