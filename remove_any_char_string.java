import java.util.Scanner;

public class remove_any_char_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        char ch=sc.nextLine().charAt(0);
        //String st=Character.toString(ch);

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=ch){
                sb.append(s.charAt(i));
            }
        }
        System.out.println("new string is "+sb);
    }
}
