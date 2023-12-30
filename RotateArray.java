package ARRAYS;

public class RotateArray {
    public static void main(String[] args) {
        int a[] = {2,3,4,3,8,4};
        int k = 2;
        int n = a.length;
        // int b[] = new int[n];
        // for(int i = 0; i<n; i++){
        //     int j=0;
           
        //     if(s<0){
                
        //     }

        //      b[i] = a[i+1];
           
        // }
        // for(int i=0;i<n;i++){
        //     System.out.println(b[i]);
        // }
            int i = 0 ;
            int j = n-1;
            int temp = 0;
            while(i<j){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i = i+k;
                System.out.println(a[i]);
            }
 
    }
}
