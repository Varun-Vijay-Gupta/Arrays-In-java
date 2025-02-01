public class Running_Sum_Of_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] ans = sum(nums);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i]+ " ");
        }
    }
    public static int[] sum(int[] nums){
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            ans[i] = ans[i - 1] + nums[i];
        }
        return ans;

    }
}
