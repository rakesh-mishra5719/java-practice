package RECURSION;

import java.util.HashMap;

public class Frequence_rec {
 
    static HashMap<Character, Integer> getCount(String str, int index){
        if(index == str.length()){
            HashMap<Character, Integer> map = new HashMap<>();
            return map;
        }
        HashMap<Character,Integer> map = getCount(str, index+1);
        char singleChar = str.charAt(index);
        if(map.get(singleChar)==null){
            map.put(singleChar,1);
        }
        else{
            int prevCount = map.get(singleChar);

            map.put(singleChar,prevCount+1);
        }
        return map;

    }
    
     public static void main(String[] args) {
        String str = "rakesh";

        HashMap<Character,Integer> map = getCount(str, 0);
        System.out.println(map);
    }
}
