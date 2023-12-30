public class SubsetSum {
    static boolean subset(int arr[],int sum,int n){
        if(n<0||sum<0){
            return false;
        }
            if(sum==0){
                return true;
            }
            return subset(arr, sum-arr[n], n-1) || subset(arr, sum, n-1);
    }
    static boolean tabulation(int arr[],int sum,int n){



        
return true;
    }
   
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,5};
        int sum = 20 ;
        int n = arr.length-1;
        System.out.println(subset(arr, sum, n));
        System.out.println(tabulation(arr, sum, n));
    }
}
