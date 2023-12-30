public class PrintCount {

    public static void fun(int i) {
        if (i == 0) {
            return;

        }

        fun(i--);
        System.out.println(i);

    }

    public static void main(String[] args) {
        int i = 10;
        fun(i);
    }
}