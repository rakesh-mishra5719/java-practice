class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class MergeList {
    Node first;
    Node second;
    Node start;
    void insertAtEnd(Node node,int i) {
        if(i == 1){

            first  = start;
        }
        else{

            second  = start;
        }
        // if linked list is empty
        if (start == null) {
            start = node;
            return;
        }
        // if linked list has only one node
        if (start.next == null) {
            start.next = node;
            return;
        }

        Node temp = start;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }
   

     
    void printList(Node i) {
        Node current = i;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    public static void main(String[] args) {
        MergeList obj = new MergeList();
        obj.insertAtEnd(new Node(1),1);
        obj.insertAtEnd(new Node(2),1);
        obj.insertAtEnd(new Node(3),1);
        obj.insertAtEnd(new Node(5),1);
        
        MergeList obj1 = new MergeList();
        obj1.insertAtEnd(new Node(7),2);
        obj1.insertAtEnd(new Node(9),2);
        obj1.insertAtEnd(new Node(45),2);
        obj1.insertAtEnd(new Node(8),2);
        
        System.out.println("-----------------");
        obj.printList(obj.first);
        System.out.println("-----------------");
        obj1.printList(obj1.second);
    }
}
