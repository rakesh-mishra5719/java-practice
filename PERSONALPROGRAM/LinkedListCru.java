
public class LinkedListCru<T> {
    Node<T> start;

    void insertAtBeg(Node<T> node) {
        if (start == null) {
            start = node;
            return;
        }

        node.next = start;
        start = node;
    }

    void insertAtEnd(Node<T> node) {
        if (start == null) {
            start = node;
            return;
        }
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
        if (start == null) {
            throw new RuntimeException("List is empty...");
        }

        if (start.next == null) {
            start = null;
            return;
        }

        Node<T> temp = start;
        while (temp.next != null) {
            temp = temp.next;
            System.out.println("det");
        }
        temp = null;
    }

    void deleteAtMid(int pos) {
        if (start == null) {
            throw new RuntimeException("List is empty...");
        }

        if (start.next == null) {
            start = null;
            return;
        }

        Node<T> temp = start;
        int i = 0;
        while (i < pos) {
            temp = temp.next;
            i++;
        }
        temp = temp.next.next;

    }

    void midPoint() {
        Node<T> slow;
        Node<T> fast;
        slow = fast = start;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("mid point : " + slow.data);
    }

    void kthFromEnd(int k) {
        Node<T> p;
        Node<T> q;
        p = q = start;
        int i = 0;
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

    void print() {
        Node<T> current = start;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedListCru<Integer> root = new LinkedListCru<>();
        root.insertAtBeg(new Node<>(10));
        root.insertAtBeg(new Node<>(20));
        root.insertAtBeg(new Node<>(30));
        root.insertAtBeg(new Node<>(40));
        root.insertAtEnd(new Node<>(100));
        root.insertAtMid(new Node<>(75), 3);
        root.deleteAtEnd();

        // root.deleteAtBeg();
        // root.deleteAtMid(2);
        root.print();

    }

}