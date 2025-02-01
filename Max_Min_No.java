import java.util.Scanner;

public class Max_Min_No {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for(int i = 0; i < numbers.length; i++){
            System.out.print("Enter number "+(i + 1)+" : ");
            numbers[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        
        System.out.println("Maximum number in array is: "+max);
        System.out.println("Minimum number in array is: "+min);
    }
}
