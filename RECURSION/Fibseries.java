package RECURSION;

//import javax.naming.spi.DirStateFactory.Result;

public class Fibseries {
    //static int r =0;
    static int fibonS(int n){
        
        if(n<=1){
            return n;
        }
        int first = fibonS(n-1);
        int second = fibonS(n-2);
        int result = first+second;
        first=second;
        second=result;
        return result;
        

    }
    public static void main(String[] args) {
        //fibonS(5);
        System.out.println(fibonS(3));
    }
}
