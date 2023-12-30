package ARRAYS;

import java.util.Arrays;

public class PairSum {
    public static void main(String[] args) {
        int arr[] = {2,3,4,65,5,54,5,8,4};
        int k = 13;
        int i = 0;
        int j = arr.length -1;
        Arrays.sort(arr);
        while(i<j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j] = temp;
            if(arr[i] + arr[j] == k){
                System.out.println(arr[i] + "," + arr[j]);
                
            }
            if(arr[i] + arr[j] < k){
                i++;
            }
            else if(arr[i] + arr[k] > k){
                j--;
            }
        }


    }
}
