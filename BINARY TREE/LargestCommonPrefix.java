public class LargestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int m = 0;
        String result = "";
        if(strs.length ==1){
            return strs[0];
        }
        while(m<strs.length-1){
            
            result = commonPrefix(strs[m], strs[m+1]);
            strs[m+1] = result;
            m++;
            
        }
        return result;
    }
    public static String commonPrefix(String str1, String str2){
    int i = 0;
    int j = 0;
    String str = "";
    
    while(i<str1.length() && j<str2.length()){
            if(str1.charAt(i) == str2.charAt(j)){
                str  = str +str1.charAt(i);
                i++;
                j++;
            }
            else return str;
        }
        
        return str;
    }
    public static void main(String[] args) {
        String str[]  = {"f"};
        String res = longestCommonPrefix(str);
        System.out.println(res);
    }
}
