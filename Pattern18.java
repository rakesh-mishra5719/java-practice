public class Pattern18 {
    public static void main(String[] args) {
        for(int i = 0; i<5;i++){
            for(int j=0; j<5-i;j++){
                if(i==1 && j==1 || i==1 && j==2 || i==2 && j==1){
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
