package ARRAYS;
public class RotArray{

    public static void main(String[] args) {
        int a[] = {2,3,4,3,8,4};
        int k = 2;
        int n = a.length;
        int b[] = new int[n];

        for(int i = 0; i<n; i++){
           
           
            int temp = i +k;
            temp = temp % n;

             b[temp] = a[i];
           
        }
        for(int i=0;i<n;i++){
            System.out.println(b[i]);
        }
    }
}