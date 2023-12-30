package RECURSION;

public class NQueen {
    static int getCount(boolean[][]board , int currentRow){
        int count =0 ;
        if(currentRow==board.length){
            return 1;
        }
        for(int col = 0; col < board.length;col++){
            if(isSafeArea(board,currentRow,col)){
                board[currentRow][col]= true;
                count+= getCount(board, currentRow+1);
                //back tracking statement
                board[currentRow][col] = false;

            }
        }
        return count;
    }
    static boolean isSafeArea(boolean[][] board, int row, int col){

        for(int i = row;i>=0;i--){
            if(board[i][col]){
                return false;
            }
        }
        for(int i = row,j=col;i>=0&& j>=0;i--,j--){
            if(board[i][j]){
                return false;
            }
        }
        for(int i = row,j=col;i>=0&& j<board.length;i--,j++){
            if(board[i][j]){
                return false;
            }
        }
        return true;
    }           

    
     public static void main(String[] args) {
        boolean board [][]= new boolean[4][4];
       int res= getCount(board, 0);
       System.out.println(res);
     }
}
