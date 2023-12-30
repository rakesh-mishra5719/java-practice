public class SumDigit {
 public static int  sumFun(int n, int sum){
    
        if(n==0){
            return sum;
        }
       // sum = n + sum;
       
        return sumFun(n/10,sum+n%10);
    }
    public static void main(String[] args) {
        
        System.out.println(sumFun(26356, 0));
    }
}
