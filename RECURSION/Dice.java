package RECURSION;

import java.util.ArrayList;

public class Dice {
    //static int current;
    static ArrayList<String>  diceCount (int n, int target){
        if(n==target){
            return ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        if(n>target){

        }
        for(int dice =1;dice<=6;dice++){
            int current = n + dice;
            ArrayList<String> list = countways(current,target);
            for(String str:list)
        }
    }
    public static void main(String[] args) {
        System.out.println(diceCount(0,10));
    }
}
