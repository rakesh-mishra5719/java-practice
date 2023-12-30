class First{
    public void resume(){
        System.out.println("first");
    }
}
class First1 extends First{
}

public class MethodHidding {
   
    
    
    public static void main(String[] args) {
   
       First b1 = new First();
       First b2  = new First1();
       b1.resume();
       b2.resume();

       
    }
}
