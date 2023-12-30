package RECURSION;

public class exercise4 {
    
    public static String fun(String str,int i){
        //char singleChar = str.charAt(i);
        if(i==str.length()){
            return "";
        }
        
        if(str.charAt(i)=='p' && str.charAt(i+1)=='i'){
            //str.charAt(i)='3';
            //str.charAt(i+1)='.14';
            return "3.14"+ fun(str, i+2);
        }
        else{
            return str.charAt(i)+fun(str,i+1);
        }
    }
    public static void main(String[] args) {
        String str = "2*pi+3*pi=5*pi";
        String str2 = fun(str,0);
        System.out.println(str2);
    }
}
