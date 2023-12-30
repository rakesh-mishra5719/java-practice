public class MaximumSubarray {
    public static int maxSubarray(int arr[],int n){
        int max = arr[0];
        int sum = 0;
        for(int i =0;i<n;i++){
            sum = sum+arr[i];
            max = Math.max(max, sum);
            if(sum<0) sum =0;
        }
        return max;
    }
    public static void main(String[] args) {
        // using kadane's algorithm
        int arr[]  = {2,3,-5,-1,2,-1,5,9};
        int n = arr.length;
        int res  = maxSubarray(arr, n);
        System.out.println(res);
    }
}
