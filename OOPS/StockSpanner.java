
import java.util.Stack;
class StockSpanner {
    private final Stack<int[]> stack;

    public StockSpanner() {
        this.stack = new Stack<>();
    }
    
    public int next(int price) {
        int sum = 1;

        while(!stack.isEmpty() && stack.peek()[0] <= price)
            sum += stack.pop()[1];

        this.stack.push(new int[] { price, sum });

        return sum;
    }
    public static void main(String[] args) {
       StockSpanner obj = new StockSpanner();
       obj.next(100);
       obj.next(89);
       obj.next(60);
       obj.next(75);
       obj.next(65);
     int r = obj.next(85);
     System.out.println(r);
      
    }
}