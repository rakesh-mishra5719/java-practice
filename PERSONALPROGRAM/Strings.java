package PERSONALPROGRAM;

public class Strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("rakesh");
        // System.out.println(sb);
        // //charAt index 0
        // System.out.println(sb.charAt(0));

        // //set char at index
        // sb.setCharAt(2, 'm');
        // System.out.println(sb);

        // //insert 
        // sb.insert(0, 's');
        // System.out.println(sb);
        // sb.insert(3, 'm');
        // System.out.println(sb);

        // //delete the extra m
        // sb.delete(3, 5);
        // System.out.println(sb);
        // sb.append(" ");
        // sb.append("m");
        // sb.append("i");
        // sb.append("s");
        // sb.append("h");
        // sb.append("r");
        // sb.append("a");
        // System.out.println(sb);
        // System.out.println(sb.length());

        for(int i = 0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
