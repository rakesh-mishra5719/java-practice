public class CommonString {
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
            else j++;
        }
        
        return str;
    }
    public static void main(String[] args) {
        String str1 = "rak";
        String str2 = "rakesh";
        String str = commonPrefix(str1, str2);
        System.out.println(str);
    }
}
