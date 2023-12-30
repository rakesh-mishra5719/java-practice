package RECURSION;

import java.util.ArrayList;

public class WellFormed {

    static ArrayList <String>  wellFormedBracket(int n){
        ArrayList <String> bracket = new ArrayList<>();
        helper(bracket, "", 0, 0, n);
        return bracket;
        }
       
        static void helper(ArrayList<String> bracket, String currentBracket, int open, int close,int max){
            //base case
            if(currentBracket.length()== max*2){
                bracket.add(currentBracket);
                return;
            }
            if(open < max){

                helper(bracket, currentBracket+"(", open+1, close, max);
            }
            if(close<open)
                helper(bracket, currentBracket+")", open, close+1, max);

        }
    public static void main(String[] args) {
     int n =3;
     ArrayList <String> ans = new ArrayList<>();
     
     ans = wellFormedBracket(n);
     System.out.println(ans);   
        
    }
}
