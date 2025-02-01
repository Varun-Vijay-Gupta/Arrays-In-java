import java.util.Scanner;

public class Check_Asc_Or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for(int i = 0; i < numbers.length; i++){
            System.out.print("Enter number "+(i + 1)+" : ");
            numbers[i] = sc.nextInt();
        }
        System.out.print("Array: ");
        System.out.print("{");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]+ ",");
        }
        System.out.println("}");

        boolean IsAsc = true;

        for(int i = 0; i < numbers.length - 1; i++){
            if(numbers[i] > numbers[i + 1]){
                IsAsc = false;
            }
        }
        if(IsAsc == true){
            System.out.println("The array is in ascending order.");
        }
        else{
            System.out.println("The array is not in ascending order.");
        }
       
    }
}
