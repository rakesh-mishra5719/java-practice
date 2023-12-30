

public class IsPrime {
    static Boolean isPrime(int n,int i){
        if(n%i==0){
            return false;
        }
        if(i == n/2){
            return true;
        }
        return isPrime(n, i+1);

    }
    public static void main(String[] args) {
        boolean result = isPrime(3,2);
        System.out.println(result);
    }
}
