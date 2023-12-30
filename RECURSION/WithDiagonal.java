package RECURSION;
import java.util.ArrayList;
public class WithDiagonal {
    static ArrayList<String> mazePath(int r, int c,int currentRow, int currentCol){
        if(currentRow==r && currentCol==c){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        if(currentRow>r || currentCol>c){
            ArrayList<String> list=new ArrayList<>();
            return list;
        }
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> horizontal = mazePath(r, c, currentRow, currentCol+1);
        for(String s: horizontal){
            result.add("H" + s);
        }
    
        ArrayList<String> vertical = mazePath(r, c, currentRow+1, currentCol);
        for(String s: vertical){
            result.add("V" + s);
        }
        
        ArrayList<String> daigonal = mazePath(r, c, currentRow+1, currentCol+1);
        for(String s: daigonal){
            result.add("d" + s);
        }

        return result;
        
    }
    public static void main(String[] args) {
        ArrayList<String> res = mazePath(3, 3, 1, 1);
        System.out.println(res);
     
    }
}
