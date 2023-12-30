package PERSONALPROGRAM;

public class Pireplace {
    public static String piRepl(String str, int i){
        if(i==str.length()){
            return "";
        }
        if(str.charAt(i) == 'p' && str.charAt(i+1)=='i'){
            return "3.14"+piRepl(str, i+2);
        }
        else {
            return str.charAt(i)+piRepl(str, i+1);
        }

    }
    public static void main(String[] args) {
        String str = "2*pi+3*pi";
        String str2 = piRepl(str, 0);
        System.out.println(str2);
    }
}
