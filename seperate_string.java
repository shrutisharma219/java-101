import java.util.Scanner;

public class seperate_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            sb.append(" ");
        }
        System.out.println("seperated string is "+sb);
    }
}
