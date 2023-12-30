public class CountingStairs {
    static int cache[];
    static int a[];
    static int memo(int n){
        if(cache[n-1] != 0){
            return cache[n-1];
        }
        if(n==1 || n==0){
            return 1;

        }
        else if(n==2){
            return 2;
        }
        cache[n-1] = climb(n-1);
        cache[n-2] = climb(n-2);
        return climb(n-1)+climb(n-2);
    }
    static int climb(int n){
        if(n==1 || n==0){
            return 1;

        }
        else if(n==2){
            return 2;
        }
        return climb(n-1)+climb(n-2);
    }
    // static int tabulation(int n){
    //     for(int i=2;i<n;i++){
    //         a[i]=a[i-1]+a[i-2];
    //     }
    //     return a;
    // }
    
    public static void main(String[] args) {
        int res;
        res = climb(3);
        
        System.out.println(res);
        res = memo(3);
        System.out.println(res);
    }
}
