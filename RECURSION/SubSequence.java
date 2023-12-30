package RECURSION;

import java.util.ArrayList;

public class SubSequence {
    static ArrayList<String> subseq(String str){
        if(str.length()==0){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        char currentChar=str.charAt(0);
        String remainingstring = str.substring(1);
        ArrayList<String> temp = subseq(remainingstring);
        ArrayList<String> result = new ArrayList<>();
        for(String s:temp)
        {
            result.add(s);
            result.add(currentChar+s);
        }
        System.out.println(result);
        return result;




    }
    public static void main(String[] args) {
        ArrayList<String> res = subseq("Mishra");
        System.out.println(res);
        
    }
}
 