import java.util.Arrays;

public class MEX {
    public static int findMissingNumber(int n, int k, int []a) {
        // Write your code here.
        Arrays.sort(a);
        int output = 0;
        int b[] = new int[k];
        for(int i =0;i<k;i++){
            b[i] = a[i];
        }
        for(int i =0;i<b.length; i++){
            
            if(i != b[i]){
                output = i;
                return output;
            }
            else output = i+1;
        }
        return output;
    }
    public static void main(String[] args) {
        int a[] = {6,9,0,10,10,4,2,7,7,0,9,1,8,8,10,0,9,4,8,5,1,1,1};
        int n =a.length;
        int k = 7;
        int result = findMissingNumber(n, k, a);
        System.out.println(result);
    }
}
