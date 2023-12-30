package RECURSION;

public class PowerFour {
    static int r=0;
    static boolean powerTwo(int n){
        if(n==1){
            return true;
        }
        
        if(n%4>0 && n%4<4){
            return false;
        }
        else{
         return powerTwo(n/4);
        }
    }
    public static void main(String[] args) {
        System.out.println(powerTwo(20));
    }
}
