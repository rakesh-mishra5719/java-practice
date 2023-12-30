public class LCS {
    static int count = 0;

    public static int longestCommonSubsequence(String t1, String t2) {
        count++;
        int[] memo = new int[t2.length() + 1];
        char[] t1c = t1.toCharArray(), t2c = t2.toCharArray();
        for (int i = t1c.length - 1; i > -1; i--) {
            int previousRigth = 0, newRight = 0;
            for (int j = t2c.length - 1; j > -1; j--) {
                int tmp = memo[j];
                int max;
                if (t1c[i] == t2c[j])
                    max = previousRigth + 1;
                else
                    max = Math.max(tmp, newRight);
                memo[j] = newRight = max;
                previousRigth = tmp;
            }
        }
        return memo[0];
    }

    public static int tabilation(String str1,String str2){
        int m = str1.length();
        int n = str2.length();
        int [][] matrix = new int[m+1][n+1];
        for (int i = 0; i <=m; i++) {
            for (int j = 0; j <=n; j++) {
                if( i ==0 || j==0){
                    matrix[i][j] = 0;
                }
                else{
                    if(str1.charAt(i-1) == str2.charAt(j-1)){
                        matrix[i][j] = matrix[i-1][j-1]+1;           
                         }
                         else matrix[i-1][j-1] = Math.max(matrix[i-1][j], matrix[i][j-1]);
                }
            }
            
        }

        return matrix[m][n];
    }

    public static void main(String[] args) {
        int result = longestCommonSubsequence("rakesh", "kesh");
        System.out.println(result);
        System.out.println(count);
        int res = tabilation("rakesh", "kesh");
        System.out.println(res);
    }

}
