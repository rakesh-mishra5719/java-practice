public class DiceCount {
    static int memoCount = 0;
    static int memo(int currentValue, int endValue,int cache[]){
        if(cache[currentValue] != 0){
            return cache[currentValue];
        }
        if(currentValue == endValue){
            return 1;
        }
        if(currentValue > endValue){
            return 0;
        }
        int count = 0;
        for (int i = 1; i <= 6; i++) {
            memoCount++;
            
            count  = count + countWays(currentValue + i, endValue);
            
        }
        cache[currentValue] = count;
        return cache[currentValue];
    }
     static int tabulation(int currentValue, int endValue){
        int cache[] = new int[endValue+1];
        cache[endValue] = 1;
        for (int i = endValue-1; i >=0; i--) {
            int count = 0;
            for(int dice = 1;dice<=6 && dice +i < cache.length; dice++){
                count+= cache[dice+i];
            } 
            cache[i] = count;
            
        }
        return cache[currentValue];
        
        
     }
    static int countWays(int currentValue, int endValue){
        if(currentValue == endValue){
            return 1;
        }
        if(currentValue > endValue){
            return 0;
        }
        int count = 0;
        for (int i = 1; i <= 6; i++) {
            count  = count + countWays(currentValue + i, endValue);
        }
        return count;
    }
    public static void main(String[] args) {
        int currentValue = 0;
        int endValue = 10;
        int cache[] = new int[endValue];
        int res = countWays(currentValue, endValue);
        System.out.println(res);
        res = memo(currentValue, endValue, cache);
        System.out.println(res);
        // System.out.println(memoCount);
        res = tabulation(currentValue, endValue);
        System.out.println("tab : "+ res);
    }
}
