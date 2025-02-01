public class Max_Consecutive_1s {
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1,0,1,0,1,1,1,1};
        int a = consecutive1s(arr);

        System.out.println("Maximum consecutive 1's in the array is: "+a);
    }

    public static int consecutive1s(int[] arr){
        int count = 0;
        int result = 0;

        for(int i = 0; i <= arr.length - 1; i++){
            if(arr[i] != 1){
                count = 0;
            }
            else{
                count++;
                result = Math.max(result, count);
            }
        }
        return result;
    }
}
