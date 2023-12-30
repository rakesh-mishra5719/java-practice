package ARRAYS;
public class ArrayAddition{
    public static void main(String[] args) {
        int x[] = {9,7,5,5};
        int y[] = {2,7,6,8};
        int x_len = x.length;
        int y_len = y.length;
        int n = x_len>y_len? x_len:y_len;
        int z[] = new int[n];
        //int i = x.length-1;
        // int j = y.length-1;
        // int k = z.length-1;
        int temp = 0;
        int carry = 0;
        for(int i = x.length-1;i>=0;i--){
            temp = x[i]+y[i];
            z[i] = temp%10 + carry ;
            carry = temp/10;
           
        }
        if(carry!=0){
            System.out.print(carry);
            
        }
        for(int f = 0;f<z.length;f++){
            System.out.print(z[f]);
        }
      }
}