import java.util.Arrays;

public class Second_Largest_No {
    public static void main(String[] args) {
        int [] arr = {12,35,1,10,34,1};
        int c = secondLargestNo(arr);

        System.out.println("The second largest number in the array is: "+c);

    }
    public static int secondLargestNo(int[] arr){
        Arrays.sort(arr);
        int second_max = Integer.MIN_VALUE;

        for(int i = 0; i <= arr.length - 2; i++){
            if(arr[i] > second_max){
                second_max = arr[i];
            }
        }
        return second_max;
    }
}
