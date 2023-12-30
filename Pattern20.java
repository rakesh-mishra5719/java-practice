public class Pattern20 {
    public static void main(String[] args) {
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5-i; j++)
            {
                System.out.print(" ");
            }
            for(int k = 0; k<2*i+1; k++){
                if(i== 1 && k==1 || i==2 && k==1 || i==2 && k==2 || i==2 && k==3 || i==3 && k==1 || i==3 && k==2 || i==3 && k==3 || i==3 && k==4 || i==3 && k==5 ){
                    System.out.print(" ");
                }
                else{

                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
