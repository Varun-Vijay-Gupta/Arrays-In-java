import java.util.Scanner;

public class Name_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        String[] names = new String[n];

        for(int i = 0; i < names.length; i++){
            System.out.print("Enter element "+ (i + 1)+ " : ");
            names[i] = sc.next();
        }
        System.out.print("Names in the array are: ");
        for(int i = 0; i < names.length; i++){
            System.out.print(names[i] + " ");
        }
    }
}
