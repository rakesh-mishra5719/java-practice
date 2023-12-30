class Stack{
    int top = -1;
    int size = 5;
    int Stack[] = new int [size];
    public void push (int data){
        if(top == size-1){
            System.out.println("stack is full");
        }
        top++;
        Stack[top] = data;
    }
    void pop(){
        int value;
        if(top==-1){
            System.out.println("stack is empty");
        }
        else{
            value = Stack[top];
            top--;
            System.out.println("pop element is " + value);
        }
    }
    void peek(){
        if(top == -1){
            System.out.println("underflow");
        }
        else{
            System.out.println("peek is : "+ Stack[top]);
        }

    }
    void display(){
        int i;
        for(i = top;i>=0;i--){
            System.out.println(Stack[i]);
        }
    }
}

public class StackCrud {


    public static void main(String[] args) {
        Stack obj = new Stack();
        obj.push(10);
        obj.push(11);
        obj.push(13);
        obj.pop();
        obj.display();
    }
}
