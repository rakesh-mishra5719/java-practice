public class Pattern19 {
    public static void main(String[] args) {
        for(int i = 0; i<5; i++){
            for(int j = 0; j<i;j++){
                System.out.print(" ");
            }
            for(int k = 0; k<5-i;k++){
                if(i==1 && k ==1 || i==1 && k ==2 || i==2 && k ==1){
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
