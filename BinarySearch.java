package ARRAYS;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        int high = arr.length;
        int low = 0;
        int s = 45;
        while(low <= high){
            int mid =  (low + high)/2;
            if(arr[mid] == s){
                System.out.println("element search");
                break;
            }
            else if(s>arr[mid]){
                low = mid +1 ;

            }
            else if(s<arr[mid]){
                high = mid -1;
            }
            
        }
        System.out.println("not found");
    }
}
