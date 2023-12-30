class Node<T> {
    T data;
    Node<T> next;
    Node(T data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedListCRUD<T> {
    Node<T> start;

    void insertAtBeg(Node<T> node) {
        // if linked list is empty
        if (start == null) {
            start = node;
            return;
        }

        node.next = start;
        start = node;
    }

    void insertAtEnd(Node<T> node) {
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

        Node<T> temp = start;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    void insertAtMid(Node<T> node, int pos) {
        // if linked list is empty
        if (start == null) {
            start = node;
            return;
        }
        if (pos == 0) {
            insertAtBeg(node);
        }

        int i = 1;
        Node<T> temp = start;
        while (i < pos) {
            temp = temp.next;
            i++;
        }
        node.next = temp.next;
        temp.next = node;
    }

    void deleteAtBeg() {
        if (start == null) {
            throw new RuntimeException("List is empty...");
        }

        if (start.next == null) {
            start = null;
            return;
        }

        start = start.next;
    }

    void deleteAtEnd() {
        Node<T> temp = start;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp = null;

    }

    void deleteAtMid(int pos) {
        if (start == null) {
            System.out.println("underflow");
            return;
        }
        if (pos == 0) {
            deleteAtBeg();
        }

        int i = 1;
        Node<T> temp = start;
        while (i < pos) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

    void midPoint() {
        Node<T> slow;
        Node<T> fast;
        slow = fast = start;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Mid Point : " + slow.data);
    }

    void kthFromEnd(int k) {
        Node<T> p;
        Node<T> q;
        p = q = start;
        int i = 1;
        while (i < k) {
            q = q.next;
            i++;
        }
        while (q.next != null) {
            q = q.next;
            p = p.next;
        }
        System.out.println("Kth element is : " + p.data);
    }

    void detectCycle() {

        Node<T> slow;
        Node<T> fast;
        slow = fast = start;
        while (fast.next != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("there is a loop");
                break;
            }
        }

    }

    void detectAndRemoveCycle() {

    }

    
    void reverseIterate() {
        if (start == null) {
            System.out.println("Linked List is Empty...");
            return;
        }
        if (start.next == null) {
            System.out.println("Only one node is available...");
            return;
        }
        Node<T> currentNode = start;
        Node<T> prevNode = null;
        while (currentNode != null) {
            Node<T> nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        start = prevNode;
    }
    
    Node<Integer> reverseIterateRec(Node<Integer> currentNode, Node<Integer> prevNode) {
        if (currentNode == null) {
            return prevNode;
        }
        // if (currentNode.next == null) {
        //     System.out.println("Only one node is available...");
        //     return currentNode;
        // }
        Node<Integer> nextNode = currentNode.next;
        currentNode.next = prevNode;
        return reverseIterateRec(nextNode, currentNode);
    }

    
    void print() {
        Node<T> current = start;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

                // <---------------------palindrome start-------------------->
    
    
    public static void main(String[] args) {

        LinkedListCRUD<Integer> root = new LinkedListCRUD<>();
        root.insertAtBeg(new Node<>(10));
        root.insertAtBeg(new Node<>(20));
        root.insertAtBeg(new Node<>(30));
        root.insertAtBeg(new Node<>(40));
        root.insertAtEnd(new Node<>(100));
        root.insertAtMid(new Node<>(75), 3);
        root.print();
        
    
        
        // root.reverseIterateRec(, null);
        root.print();
        // root.reverseIterate();
        // root.print();
        
      
    }
}