import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //input
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter element "+ (i + 1)+ " : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Elements in array are: ");
        //output
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}