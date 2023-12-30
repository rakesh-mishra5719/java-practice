class MinMaxArray{
    public static int min(int arr[], int n){
        int min = arr[0];
        
        for(int i = 0;i<n; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static int max(int arr[], int n){
        int max = arr[0];
        
        for(int i = 0;i<n; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int arr[] ={9,1,6,2,0,8};
        int n = arr.length;
        int min = min(arr, n);
        int max = max(arr, n);
        System.out.println("max of array :" + max);
        System.out.println("min of array :" + min);

        
    }
}