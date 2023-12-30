//import java.util.Scanner;

public class PrimeExample{
    public static void main(String args[]){
        int i,m=0,flag=0,n=3;
        if(n==0||n==1){
            System.out.println(n+"is not prime number");
        }
        else{
            for(i=0;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+"is not prime number");
                    flag=1;
                }
            }
            if (flag==0) {
                System.out.println(n+"is prime number");
                
            }

        }
    }
}