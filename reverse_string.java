import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        String newst=sb.toString();
        System.out.println("new string is "+newst);
    }
    
}
