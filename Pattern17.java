public class Pattern17 {
    public static void main(String[] args) {
        for(int i = 0; i<5; i++){
            for(int j = 0;j<=5-i; j++){
                System.out.print(" ");

            }
            for(int k = 0; k<=i; k++){
                if(i==2 && k==1 || i==3 && k==1 || i==3 && k==2)
                System.out.print(" ");
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
