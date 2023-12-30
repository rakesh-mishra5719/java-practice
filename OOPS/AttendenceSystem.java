import java.util.Scanner;

public class AttendenceSystem {
   static Scanner sc = new Scanner(System.in);
    static String name;
    static Character sec;
    static int roll_no;
    static String att[] = new String[31];
    
    public static void page1() {
        
        System.out.println("Enter Name :");
        name = sc.nextLine();
        
        System.out.println("Enter Section");
        sec = sc.nextLine().charAt(0);
        System.out.println("Enter your roll number");
        roll_no = sc.nextInt();
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public static void page2() {
        System.out.println("WELCOME " + name);
        System.out.println("section : " + sec);
        System.out.println("Roll no : " + roll_no);
        System.out.println("Attendence for january");
        for (int i = 1; i <= 31; i++) {
            
            System.out.print(i + " , ");
            if (i % 7 == 0) {
                System.out.println();
            }
        }
        sc.next();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
    }
    
    public static void page3() {
    
        System.out.println("Enter A for absent");
        System.out.println("Enter P for present");
        for (int i = 1; i <= 31; i++) {
            System.out.println(i + "/" + "jan/2023");
            att[i-1] = sc.next();
        }
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public static void page4() {
        int countP = 0;
        int countA = 0;
        for (int i = 0; i <= 31; i++) {
            System.out.println(i + 1 + "/" + "jan/2023" + " : " + att[i]);
            String r = att[i];

            if(r.equals("P") || r.equals("p")){
                countP++;
            }
            else{
                countA++;
            }
        }
        System.out.println("Total present : "+ countP);
        System.out.println("Total absent : "+ countA);
        System.out.println("percentage : " + countP*100/31);
    }
    
    public static void main(String[] args) {
        page1();
        
        page2();
        
        page3();
        
        page4();
        
    }
}
