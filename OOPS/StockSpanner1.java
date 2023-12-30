import java.util.Stack;

public class StockSpanner1 {
    static void stockSpan(int arr[], int n){

        Stack<Integer> st = new Stack<>();
       st.push(0);
       System.out.print(1+",");
       int span;
       for(int i = 1;i<n;i++){
        while(st.isEmpty() == false  && arr[st.peek()] <= arr[i]){
            st.pop();
        }
        span = st.empty()?i+1:i-st.peek();
        System.out.print(span + ",");
        st.push(i);
       }
    }
    public static void main(String[] args) {
        int price[] = {100,80,60,70,90,75,85};
        stockSpan(price, price.length);
    }
}
