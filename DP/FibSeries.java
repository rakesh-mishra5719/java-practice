public class FibSeries {
    static int memoCount = 0;
    static int recCount = 0;

    static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        recCount++;
        int first = fib(n-1);
        int second = fib(n-2);
        int result  = first + second;
        return result;
    }
    static int tabulation(int n){
        int arr[] = new int[n+1];
        if( n == 0 || n ==1){
            return n;
        }
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2;i<=n;i++){
            
            arr[i] = arr[i-1] + arr[i-2];
            
            
        }
            return arr[n];
    }
    static int memoization(int n, int cache[]){
        
        if( n == 0 || n ==1){
            return n;
        }
        if(cache[n] != 0){
            return cache[n];
        }
        memoCount++;
        int first = memoization(n-1,cache);
        int second = memoization(n-2,cache);
        int result  = first + second;
        cache[n]  = result;
        return cache[n];
    }
    public static void main(String[] args) {
        int n = 7;
        int cache[] = new int[n+1];
        int res;
        res = fib(n);
        System.out.println("fib count " + recCount);
        System.out.println("memo count " + memoCount);
        System.out.println("fib result " + res);
        res = memoization(n, cache);
        System.out.println("memo result " + res);
        res = tabulation(n);
        System.out.println("result " + res);
    }
}
