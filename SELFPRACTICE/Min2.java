public class Min2 {
    public static int gcd(int a,int b){

       if(b != 0){
        return gcd(b, a%b);
       }
       else
       return a;
   }
    
    public static int minimumJumps(int x, int y) {
        // Write your code here.
       if(x ==0 && y==0){
           return 0;
       }

       if(x==0){
           return 1;
       }
       if(y==0){
           return 1;
       }

       int result= gcd(x,y); 

        int steps = (x+y)/result;
        return steps;

}

 public static void main(String[] args) {
        int x= 345;
        int y = 14;
        int step = minimumJumps(Math.max(x, y), Math.min(x, y));
        System.out.println(step);
    }
}
