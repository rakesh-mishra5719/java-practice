class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next  = null;
    }
    
}
public class AlternateList {
    Node list1;
    Node even;
    Node odd; 
  
   
    void insertAtEnd(Node node){
        if(list1 == null){
            list1 = node;
            return;
        }
        if(list1.next == null){
            list1.next = node;
            return;
        }
        Node temp = list1;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }
     
    void print() {
        Node current = list1;
    
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    void alternate(){
       
        while(list1 != null){
            even = list1;
            list1 = list1.next;
            odd = list1;
            list1 = list1.next;
        }
       
        

     
        
    }
    
    public static void main(String[] args) {
       
        AlternateList node = new AlternateList();
        
        node.insertAtEnd(new Node (5));
        node.insertAtEnd(new Node (19));
        node.insertAtEnd(new Node (15));
        node.insertAtEnd(new Node (14));
        node.print();
        node.alternate();
       
        
    }
}
