package RECURSION;

public class Exercise5 {
    static String output = "";
    public static void fun(String str,int i){
        output = output + str.charAt(i);
       
        if(i==str.length()-1){
            return;
        }
        
        if(str.charAt(i)==str.charAt(i+1)){
          
            output += "*";
        }
    
             fun(str,i+1);
        
    }
    public static void main(String[] args) {
        String str = "abbbabaaba";
        fun(str,0);
        System.out.println(output);
    }
}

