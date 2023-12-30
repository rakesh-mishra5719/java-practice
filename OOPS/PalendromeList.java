class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class PalendromeList {
    Node midPoint(Node list) {
        Node slow;
        Node fast;
        slow = fast = list;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    
    }
    Node reverse(Node secondlist){
        if (secondlist == null) {
            System.out.println("Linked List is Empty...");
            return secondlist;
        }
        if (secondlist.next == null) {
            System.out.println("Only one node is available...");
            return  secondlist;
        }
        Node currentNode = secondlist;
        Node prevNode = null;
        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        secondlist = prevNode;
        return secondlist;
    }
    boolean isPalindrome(Node list){
        Node midpoint = midPoint(list);


    }
 
    public static void main(String[] args) {
        Node list1 = new Node('m');
        list1.next = new Node('a');
        list1.next.next = new Node('d');
        list1.next.next.next = new Node('a');
        list1.next.next.next.next = new Node('m');
        PalendromeList root = new PalendromeList();
        boolean r = root.isPalindrome(list1);
        System.out.println(r);
    }
}
