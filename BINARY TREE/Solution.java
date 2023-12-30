import java.util.Arrays;
public class Solution {
    static int temp;
    static int b[] = {2,4,8,5,6};
    
    

    static int xAndY(int x, int y, int a[]) {
        int j = 0;
       for(int i = 0;i<a.length;i++){
        if(a[i] >=x && a[j]<=y){
            b[j] = a[i];
            j++;
        }


       }
       Arrays.sort(b);
       return b[0];
         
       
        

        }
        public static void main(String[] args) {
            int res = xAndY(6, 7, b);
            System.out.println(res);
        }

        
    }

    
