package RECURSION;

public class PowerThree {
    static int r=0;
    static boolean powerTwo(int n){
        if(n==1){
            return true;
        }
        
        if(n%3<3 && n%3>0 ){
            return false;
        }
        else{
         return powerTwo(n/3);
        }
    }
    public static void main(String[] args) {
        System.out.println(powerTwo(30));
    }
}
