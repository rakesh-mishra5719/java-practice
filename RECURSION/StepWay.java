package RECURSION;

public class StepWay {
    static int stepWayCount(int n){
        if(n<=0){

            return 1;
        }
        if(n==1||n==0){
            return 1;

        } 
        if(n==2){
            return 2;

        } 
        else{
            return stepWayCount(n-2)+stepWayCount(n-1);
        }
        


    }
    public static void main(String[] args) {
        System.out.println(stepWayCount(4));
        
    }
}
