package RECURSION;

public class Pettern2 {
    static int  i=1;
    public static void pettern(int col){
    
        if(col==0){
            return;
        }
        System.out.print(i);
        i++;
        pettern(col-1);
        
    }
       public static void printPettern(int row , int col){
            if(row==0){
                return;
            }
            pettern(col);
            System.out.println();
            printPettern(row-1,col+1);
        }
        public static void main(String[] args) {
            printPettern(4,1);
        }
    }
    

