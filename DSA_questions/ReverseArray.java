import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int arr[], int n){
        //temp variable
        int temp;
        for(int i = 0;i < n/2;i++){
            temp  = arr[i];
            arr[i] = arr[n - i -1];
            arr[n-i-1]= temp;
        }
        for(int i = 0; i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    

    public static void main(String[] args) {
        int arr[]  ={1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        reverse(arr,n);


        //string array
        String a[]  = {"hello","world","rakesh"};

        StringBuilder rev = new StringBuilder();
        for(int i = a.length;i>0;i--){
            rev.append(a[i-1]).append(" ");
        }
        String [] revArray = rev.toString().split(" ");
        System.out.println(Arrays.toString(revArray));


    }
}
