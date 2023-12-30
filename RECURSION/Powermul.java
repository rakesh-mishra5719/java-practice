package RECURSION;

public class Powermul {
   static int r=0;
    static boolean powerTwo(int n){
        if(n==1){
            return true;
        }
        
        if(n%2!=0){
            return false;
        }
        else{
         return powerTwo(n/2);
        }
    }
    public static void main(String[] args) {
        System.out.println(powerTwo(64));
    }
}
