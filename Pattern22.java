import java.util.*;
public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row");
        int row = sc.nextInt();
        
        for(int i = 1; i<=row; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <=(2*row) - (2*i-1); k++ ){
                if(i==1 || k==1 || k==(2*row -(2*i -1))){

                    System.out.print("*");
                } 
                else
                System.out.print(" "); 
            }
            System.out.println();
        }
        sc.close();
    }
}
