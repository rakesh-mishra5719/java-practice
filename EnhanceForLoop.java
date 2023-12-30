import java.util.Scanner;

public class EnhanceForLoop {
    public static void main(String[] args) {
        String add = "";
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter your name ");
        String name = sc.nextLine();

        
        String arr[] = name.split(" ");

      //  System.out.println(arr[0]);
      for (String i : arr) {
       String addname = String.valueOf(i.charAt(0)).toUpperCase();
       String addname1 = i.substring(1).toLowerCase();
       add = add + addname  + addname1 + " ";

      }
      
        System.out.println(add);


        sc.close();
    }
}
