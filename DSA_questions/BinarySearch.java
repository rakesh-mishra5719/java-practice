public class BinarySearch {
    public static int binarySearch(int arr[], int low,int high,int k){
        int mid;
        if(high>=low){

            mid = (low+high)/2;
            if(arr[mid] == k){
                return mid+1;
            }
            else if(k > arr[mid]){
                return binarySearch(arr, mid+1, high, k);
            }
            else{
                return binarySearch(arr, low, mid-1, k);
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 5;
        int high = arr.length - 1;
        int res = binarySearch(arr, 0, high, k);
        System.out.println(res);
       
    }
}
