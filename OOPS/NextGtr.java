import java.util.Stack;
public class NextGtr {
    static void stockSpan(int arr[], int n){
        Stack<Integer> st = new Stack<>();
        st.push(0);
        System.out.print(arr[0]+",");
        int span;
        for(int i = 1;i<n;i++){
         while(st.isEmpty() == false  && arr[st.peek()] >= arr[i]){
             st.pop();
             System.out.println(arr[i]);
        
         }
         span = st.empty()?-1: arr[st.peek()];
         System.out.print(span + ",");
         st.push(i);  
        }
     }
     public static void main(String[] args) {
         int price[] = new int [] {10,4,2,20,40,12,30};
         stockSpan(price, price.length);
     
 }
}
