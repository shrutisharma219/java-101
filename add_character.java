import java.util.Scanner;

public class add_character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch;
        ch=sc.next().charAt(0);
        String st=s+ch;
        System.out.println("added string is "+st);
    }
    
}
