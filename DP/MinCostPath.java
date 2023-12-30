public class MinCostPath {
    public static int path(int arr[][], int i, int j) {

        // int matrix[][] = arr;
        // for (int i = m; i >= 0; i--) {
        //     for (int j = n; j > 0; j--) {

                



        //        matrix[i][j] = Path(matrix,i-1,j-1);
        //        matrix[i][j] = Path(matrix,i-1,j);
        //        matrix[i][j] = Path(matrix,i,j-1);
        //     }
        // }

        // return matrix[m][n];
        int m = i-1;
        int n = j-1;
        if(m<0||n<0){
            return Integer.MAX_VALUE;
        }
        if(m==0||n==0){
            return arr[m][n];
        }
        else {
            return arr[m][n] + Math.min(Math.min(path(arr, m-1, n-1), path(arr, m-1, n)), path(arr, m, n-1));
        }
    }
    

    public static void main(String[] args) {
        int arr[][] = {{4,5,5,2},{3,2,5,4},{2,4,3,7}};
        int res = path(arr, 5, 5);
        System.out.println(res);
    }
}
