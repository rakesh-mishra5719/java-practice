package PERSONALPROGRAM;

import java.util.ArrayList;

public class NewToString {
    public static void main(String[] args) {
        ArrayList<String> result= new ArrayList<>();
        String sb = "rakesh";
        StringBuffer ab = new StringBuffer(sb);
        // result.add(0, sb);
        
        // System.out.println(result);
        //String ab = "mishra";
        result.add(ab.toString());
        System.out.println(result);


    }
}