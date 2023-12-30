public class InfixToPostfix {
    static int prec(char x) {
        if (x == '+' || x == '-')
            return 1;
        if (x == '*' || x == '/' || x == '%')
            return 2;
        if (x == '^' || x == '$')  
        return 3;  
        return 0;
    }

    static void postFix(String str) {
        int n = str.length();
        Stack st = new Stack();
        Stack st2 = new Stack();
        st2.push(0);
        String exp = " ";
        for (int i = 0; i <= n; i++) {
            Character ch = str.charAt(0);
            // Character ch2;
            if (ch == '(') {
                st.push(ch);

            } 
            else if (Character.isLetter(ch) == true) {
                exp = exp + ch;
            }
             else if (ch == '+' || ch == '*' || ch == '-' || ch == '/' || ch == '^') {
                while(st.empty == false && prec(st2.peek()) >= ){
                    st2.push(ch);
                }
            }
             else if (ch == ')') {

            }
        }
    }

    public static void main(String[] args) {

        String str = "a+b(c*d)/e";
        postFix(str);
    }
}
