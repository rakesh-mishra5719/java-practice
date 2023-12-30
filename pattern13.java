public class pattern13 {
        public static void main(String[] args) {
            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5-i; j++){
                    System.out.print(" ");
                }
                for(int k = 0; k < 5; k++){
                    if(i==0 || k==0 || k==4 || i==4 )
                    System.out.print("* ");
                    else if(k==1 && i==1 || k==3 && i==1 || i == 3 && k==1 || i ==3 && k==3 || i==2 && k==2){
                        System.out.print("* ");
    
                    }
                    else
                    System.out.print("  ");
                }
                System.out.println();
            }
        }
}
