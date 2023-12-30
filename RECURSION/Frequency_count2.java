package RECURSION;

import java.util.HashMap;

public class Frequency_count2 {
    public static void main(String[] args) {
        String str = " ";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<str.length();i++){
            char singleChar = str.charAt(i);
            if(map.get(singleChar)==null){
                map.put(singleChar,1);
            }
            else{
                int preValue = map.get(singleChar);
                map.put(singleChar, preValue+1);
            }
        }
        System.out.println(map);
    }
}
