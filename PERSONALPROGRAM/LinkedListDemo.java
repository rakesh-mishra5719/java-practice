class Node<T> {
    T data;
    Node<T> next;
    Node (T data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedListDemo {
    public static void main(String[] args) {
        Node<Integer> root = new Node<>(20);
        root.next = new Node<>(24);
        root.next.next = new Node<>(35);
        root.next.next.next = new Node<>(40);

        Node<Integer> current = root;
        while(current !=null){
            System.out.println(current.data);
            current = current.next;
        }
        // Node<String> list = new Node<>("ram");
        // list.next  = new Node("shtam");
        // list.next.next = new Node("raksh");

        // Node<String> current2 = list;
        // while(current2 !=null){
        //     System.out.println(current2.data);
        //     current2 = current2.next;
        // }
        
    }
}
