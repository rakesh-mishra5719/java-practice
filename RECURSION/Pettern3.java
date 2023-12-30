package RECURSION;

public class Pettern3 {
    //static int  i=1;
    public static void spacePrint(int space){
        if(space==5){
            return;
        }
        System.out.print(" ");
        spacePrint(space+1);
    }
    public static void pettern(int col){
    
        if(col==0){
            return;
        }
        System.out.print("*");
      //  i++;
        pettern(col-1);
        
    }
     public static void printPettern(int row , int col){
            if(row==0){
                return;
            }
            spacePrint(col);
            pettern(2*col-1);
            System.out.println();
            printPettern(row-1,col-1);
    }
        public static void main(String[] args) {
            printPettern(5,5);
        }
    }

