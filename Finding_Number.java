import java.util.Scanner;

public class Finding_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] num = new int[n];

        for(int i = 0; i < num.length; i++){
            System.out.print("Enter Number "+ (i + 1)+ " : ");
            num[i] = sc.nextInt();
        }

        System.out.print("Enter the number that you want to find in the array: ");
        int x = sc.nextInt();

        for(int i = 0; i < num.length; i++){
            if(num[i] == x){
                System.out.println("Number found at index: "+i);
            }
        }
    }
}
