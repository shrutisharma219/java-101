import java.util.Scanner;

public class char_at {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i=sc.nextInt();
        char ch=s.charAt(i);
        System.out.println("char is "+ch);
    }
    
}
