package RECURSION;

public class exercise2 {
    public static int countZero(int n , int count){
        if(n==0){
            return count;
        }
        int r=n%10;
        if(r==0){
            count++;
        }
        return countZero(n/10, count);
    }
    public static void main(String[] args) {
        int zero = countZero(2020000404, 0);
        System.out.println(zero);
    }
}
