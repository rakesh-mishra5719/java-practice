package RECURSION;

public class Question1 {
    // static int i =0;
    static boolean sortedOrNot(int n[], int in) {
        if (in == n.length - 1) {
            return true;
        }
        if (n[0] <= n[1]) {
            if (n[in] <= n[in + 1]) {
                return sortedOrNot(n, in + 1);
            } else
                return false;
        }

        else {
            if (n[in] >= n[in + 1]) {
                return sortedOrNot(n, in + 1);
            }
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 9, 9, 9, 9, 1, 0 };
        System.out.println(sortedOrNot(arr, 0));
    }
}
