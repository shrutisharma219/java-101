import java.util.Scanner;
public class capitalize_first_letter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String s=sc.nextLine();
        String []sa=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String word: sa){
            char ch =word.charAt(0);
            sb.append(Character.toUpperCase(ch));
            sb.append(word.substring(1));
            sb.append(" ");
        }
        String newstring=sb.toString().trim();
        System.out.println("new string is "+newstring);
    }
}
