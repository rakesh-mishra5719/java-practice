package RECURSION;
public class Pattern1 {
public static void pettern(int col){
    if(col==0){
        return;
    }
    System.out.print(col);
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
        printPettern(5,1);
    }
}
