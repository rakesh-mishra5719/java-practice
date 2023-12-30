package PERSONALPROGRAM;
import java.util.*;
public class HashMapProgram {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //insertion 
        map.put("India", 120);
        map.put("USA", 20);
        map.put("China", 150);
        System.out.println(map);

        map.put("USA", 156);
        System.out.println(map);
        
        // //search
        // if(map.containsKey("China")){
        //     System.out.println("present in the map");
        // }
        // else
        // {
        //     System.out.println("no");
        // }
        // System.out.println(map.get("USA"));
        
        // int arr[] = {1,3,24,3,33,6};
        // for(int value : arr){
        //     System.out.print(value +" ");
            
        // }
        int a = map.get("China");
        System.out.println(a);
        // remove
        map.remove("China");
        System.out.println(map);
    }
}
