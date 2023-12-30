

import javax.management.RuntimeErrorException;

class Queue {
    int arr[];
    int size;
    int front;
    int rear;

    public Queue(int capacity) {
        this.arr = new int[capacity];
        rear = front = -1;
        size = 0;
    }

    int getSize() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }
    void enqueue(int element){
        if(size == arr.length){
            throw new RuntimeErrorException(null, "queue is full");
        }
        if(size==0){
            front = 0;
        }
        rear++;
        size++;
        if(rear == arr.length){
            rear = 0;
        }
        arr[rear] = element;
    }
    int dequeue(){
        if(size==0){
            throw new RuntimeException("queue is empty");
        }
        int temp = arr[front];
        front++;
        if(front == arr.length){
            front = 0;
        } 
        size--;
        return temp;
    }
    void display(){
        for(int i = front;i<=rear;i++){
            System.out.println(arr[i]);
        }
    }

}

public class QueueCrud {

    public static void main(String[] args) {
        Queue queue =  new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(140);
        queue.dequeue();
        // System.out.println(queue.dequeue());
        queue.display();
    }
}
