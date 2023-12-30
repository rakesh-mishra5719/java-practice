package RECURSION;
//import java.util.ArrayList;

//import javax.security.auth.x500.X500Principal;
public class HanoiTower {
    static void hanoiTime(int n,char a, char b,char c ){
        if(n==1){
            System.out.println((a + " to " + c));
            return;
        }
        hanoiTime(n-1, a, c, b);
        System.out.println(a + " to " + c);
        hanoiTime(n-1, b, a, c);

    }
    
    public static void main(String[] args) {
        int n=3;
        hanoiTime(n,'X','Y','Z');
     
    }
     
}
