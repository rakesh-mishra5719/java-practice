package ARRAYS;

public class ArraySubtraction {
    public static void main(String[] args) {
        int x[] = {5,7,5,5};
        int y[] = {2,7,6,8};
        int x_len = x.length;
        int y_len = y.length;
        int n = x_len>y_len? x_len:y_len;
        int z[] = new int[n];
        for(int i = x.length-1;i>=0;i--){
            if(x[i]<y[i]){
                x[i]=x[i]+10;
                x[i-1]= x[i-1]-1;
            }
            z[i]=x[i]-y[i];
        }
        
        for(int f = 0;f<z.length;f++){
            System.out.print(z[f]);
        }
    }
}
