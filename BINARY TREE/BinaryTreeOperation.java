import java.util.LinkedList;
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


public class BinaryTreeOperation {
    static int leftcount;
    static int rightcount;
    
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
        public void preOrder(BinaryTree<Integer> root){
            if(root == null){
                return;
            }
            System.out.println(root.data);
            preOrder(root.left);

            preOrder(root.right);
        }
        public int length(BinaryTree<Integer> root ){
            if(root == null){
                return 0;
            }
            leftcount = length(root.left);
            
           rightcount = length(root.right);
            return 1+ Math.max(leftcount, rightcount);
            
        }
        public int nodeCount(BinaryTree<Integer> root){
           
            if(root == null){
                return 0;
            }
            int counter = 1;
            counter +=nodeCount(root.left);
            
           counter += nodeCount(root.right);
            return counter;
        }

        public int maxElement(BinaryTree<Integer> root){
            if(root == null){
                return Integer .MIN_VALUE ;
            }
            
            
            int m = maxElement(root.left);
           
            int n = maxElement(root.right);
            return Math.max(root.data,Math.max(m, n));
        }

        public void inOrder(BinaryTree<Integer> root){
            if(root == null){
                return;
            }

            
            preOrder(root.left);
            System.out.println(root.data);
            preOrder(root.right);
            
        }

        public void postOrder(BinaryTree<Integer> root){
            if(root == null){
                return;
            }
            preOrder(root.left);
            preOrder(root.right);
            System.out.println(root.data);
        }

        void levelOrder(BinaryTree<Integer> root){
            LinkedList<BinaryTree<Integer>> list = new LinkedList<>();
            list.add( root);
            while(!list.isEmpty()){
                BinaryTree<Integer> currentNode = list.removeFirst();
                System.out.println(currentNode.data);
                if(currentNode.left != null){
                    list.addLast(currentNode.left);
                }
                if(currentNode.right != null){
                    list.addLast(currentNode.right);
                }
            }
        }
        public void leftview(BinaryTree<Integer> root){
              if(root == null){
                return;
            }
            LinkedList<BinaryTree<Integer>> list = new LinkedList<>();
            list.add( root);
            while(!list.isEmpty()){
                int count = list.size();
                for (int i = 0; i < count; i++) {
                    BinaryTree<Integer> current = list.poll();
                    if(i==0){
                        System.out.println(current.data);

                    }
                    if(current.left != null){
                        list.addLast(current.left);
                    }
                    if(current.right != null){
                        list.addLast(current.right);
                    }
                }                
            } 
        }

        public void rightview(BinaryTree<Integer> root){
              if(root == null){
                return;
            }
            LinkedList<BinaryTree<Integer>> list = new LinkedList<>();
            list.add( root);
            while(!list.isEmpty()){
                int count = list.size();
                for (int i = 0; i < count; i++) {
                    BinaryTree<Integer> current = list.poll();
                    if(i==count){
                        System.out.println(current.data);

                    }
                    if(current.left != null){
                        list.addLast(current.left);
                    }
                    if(current.right != null){
                        list.addLast(current.right);
                    }
                }                
            } 
        }

        void print(BinaryTree<Integer> root){
            if(root == null){
                return;
            }

            String output = "";
            output +=  root.data+ " => ";
            if(root.left != null){
                
                output += " L :"+ root.left.data+ " , ";

            }
            if(root.right != null){
                output += " R :"+ root.right.data+ " , ";
               

            }
            System.out.println(output);
            print(root.left);
            print(root.right);
        }
    public static void main(String[] args) {
        BinaryTreeOperation obj = new BinaryTreeOperation();
        BinaryTree<Integer> root = obj.insert();
      
        obj.print(root);
        obj.levelOrder(root);
        int result = obj.nodeCount(root);
        System.out.println(result);
        result = obj.maxElement(root);
        System.out.println("max : "+ result);


        obj.leftview(root);
        obj.rightview(root);
       
    }
}
    
