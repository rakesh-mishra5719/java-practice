
import java.util.Scanner;
class BinaryTree<T> {

    T data;
    BinaryTree<T> left;
    BinaryTree<T> right;
    
    BinaryTree(T data) {
        this.data = data;
        left = right = null;
    }
    
}

public class SpiralTreee {

     String msg = "root";
        BinaryTree<Integer> insert(){
            System.out.println("Enter message "+ msg + "data ");
            int data = new Scanner(System.in).nextInt();
            if(data == -1){
                return null;
            }
            BinaryTree<Integer> node = new BinaryTree<>(data);
            msg = "left";
            node.left = insert();
            msg = "right";
            node.right = insert();
            msg = "root";
            return node;
        }

   
    public static void main(String[] args) {
        SpiralTreee obj = new SpiralTreee();
       BinaryTree<Integer> root = obj.insert();
        
        
    }
}
