class stack{
    int top1 = -1;
    int size = 10;
    int top2 = size;
    int top = size;
    
        int Stack[] = new int [size];
    void push1(int data){
        if(top1 == size-1){
            System.out.println("stack is full");
        }
        top1++;
        Stack[top1] = data;
    }
    void pop1(){
        int value;
        if(top1==-1){
            System.out.println("stack is empty");
        }
        else{
            value = Stack[top1];
            top1--;
            System.out.println("pop element is " + value);
        }
    }
    void push2(int data){
        
        if(top2 - top1 == 1 ){
            System.out.println("stack is full");
        }
        top2--;
        Stack[top2] = data;
        System.out.println(Stack[top2]);
    }
    void pop2(){
        int value;
        if(top2==size){
            System.out.println("stack is empty");
        }
        else{
            value = Stack[top2];
            top2++;
            System.out.println("pop element is " + value);
        }
    }
    void display1(){
        int i;
        for(i = 0;i<=top1;i++){
            System.out.println(Stack[i]);
        }
    }
    void display2(){
        int i;
        for(i = top-1;i>top1;i--){
            System.out.println(Stack[i]);
        }
    }
  
}
public class TwostackIn1Array {
    public static void main(String[] args) {
        stack obj = new stack();
        obj.push1(1);
        obj.push1(2);
        // obj.pop1();
        // stack obj2 = new stack();
        obj.display1();
        System.out.println("-----------");
        obj.push2(9);
        obj.push2(8);
        obj.push2(87);
       
        System.out.println("-----------------");
        // obj.pop2();
        obj.display2();
    }
}
