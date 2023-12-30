package RECURSION;

public class exercise3 {
     static int sum=1;
    public static int powerMul(int n, int power){
        if(power==0){
            return sum;
        }
        sum=sum*n;
        return powerMul(n, power-1);
        
    }
    public static void main(String[] args) {
        System.out.println(powerMul(4,3));
    }
}
