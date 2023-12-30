package RECURSION;

import java.util.ArrayList;
public class PermutationsString {
    
   
    
   
    static ArrayList<String> permutations(String str) {
            if(str.length() == 0) {
                ArrayList<String> empty = new ArrayList<>();
                empty.add("");
                return empty;
            }
            char currentChar = str.charAt(0);
            System.out.println(currentChar);
            String remString = str.substring(1);
            System.out.println(remString);
            ArrayList<String> temp = permutations(remString);
            
            System.out.println("temp ="+temp);
            ArrayList<String> result = new ArrayList<>();
            System.out.println(result);
            for(String s : temp) {
                for(int i = 0; i <= s.length(); i++) {
                    StringBuffer sb = new StringBuffer(s);
                    sb.insert(i, currentChar);
                    System.out.println("sb ="+sb);
                    result.add(sb.toString());
                    System.out.println("result ="+result);
                }
            }
            return result;
    
        }
        public static void main(String[] args) {
            ArrayList<String> result= permutations("abc");
            System.out.println(result);
            
        }
     }  
