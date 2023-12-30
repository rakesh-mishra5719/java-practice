import java.util.Arrays;

public class ChocolateDisProblem {
    public static int findMinDiff(int arr[],int m){
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i+m-1 < arr.length; i++) {
            minDiff = Math.min(arr[i+m-1]-arr[i],minDiff);
        }
        return minDiff;

    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,7,3,66,456,3,45};
        int m = 5;
        int res = findMinDiff(arr, m);
        System.out.println(res);
    }
}
