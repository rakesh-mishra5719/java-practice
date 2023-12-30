package PERSONALPROGRAM;

public class Sum1DArray {
    public static int[] runningSum(int[] nums) {
        
        int sum = 0;
        System.out.println(nums);
        for(int i=0;i<nums.length;i++){
            sum = nums[i] + sum;
            nums[i] = sum;
            // System.out.print(nums[i]);
        }
        return nums;
    }
        public static void main(String[] args) {
        int a[] = {1,1,1,1,1};
        int b[] = runningSum(a);
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]);
        }

    }
}
