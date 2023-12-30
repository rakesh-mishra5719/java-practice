import java.util.Stack;
import java.util.HashMap;

public class Bracket {
    boolean check(String str){
        
        Stack <Character> obj = new Stack<>();
        HashMap < Character,Character > map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
     for(int i = 0;i<str.length();i++){
        Character ch = str.charAt(i);
        if(ch == '(' || ch == '{' || ch == '['){
            obj.push(ch);
        }
        else if(ch == ')' || ch == '}' || ch == ']'){
            Character pk = obj.peek();
           if( map.get(pk) == ch){
            obj.pop();
           }
           else{
            return false;
           }
           return true;
        }
       
     }
     return false;   
    }
    

    public static void main(String[] args) {
        Bracket obj1 = new Bracket();
        String  str = "({[({([])})]})";
        boolean result = obj1.check(str);
        System.out.println(result);
        
    }
}
