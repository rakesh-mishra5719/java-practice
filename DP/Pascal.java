import java.util.*;
public class Pascal {
    static public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }
            if (i > 0) {
                row.add(1);
            }
            result.add(row);
        }
        return result;
    }
    public static void main(String[] args) {
        int row = 6;

        List<List<Integer>> result = new ArrayList<>();
        result = generate(row);
        System.out.println(result);
    }
}
