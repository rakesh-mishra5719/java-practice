package ARRAYS;

public class FrequencyCountArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,5,5,6,7,8};
        int low = 0;
        int high = arr.length;
        int firstindex = 0;
        int lastindex = 0;
        int search = 5;
        while(low <= high){

            int mid  = (low + high)/2;
            if(arr[mid] == search){
                firstindex = mid;
               
                high = mid - 1;
            }
            if(search>arr[mid]){
                low = mid+1;

            }
            else if(search<arr[mid]){
                high = mid - 1;
            }
            
            

        }
        low = 0;
        high = arr.length;
        
        while(low <= high){

            int mid  = (low + high)/2;
            if(arr[mid] == search){
                lastindex = mid;
               
                low = mid + 1;
            }
            if(search>arr[mid]){
               low = mid + 1;

            }
            else if(search<arr[mid]){
                high = mid - 1;
            }
            
            

        }
        System.out.println(firstindex);
        System.out.println(lastindex);

    }
}
