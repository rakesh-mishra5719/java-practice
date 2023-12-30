public class MinimumJumps {
    public static int longestStep(int x,int y){
        int hcf = 1;
        for(int i = 1;i<=x && i<=y ;i++){
            if(x%i ==0 && y%i ==0){
                hcf = i;
            }
        }
        return hcf;

    }
    public static int MinimumJumpscount(int x,int y){
        // for the value of k -function hcf
        int k = longestStep(x , y); 
        System.out.println(k);
        int steps = (x+y)/k;
        return steps;

    }
    public static void main(String[] args) {
        int x= 35;
        int y = 14;
        int step = MinimumJumpscount(x, y);
        System.out.println(step);
    }
}