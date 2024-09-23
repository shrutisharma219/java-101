import java.util.Scanner;
public class insert_string_in_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ogst=sc.nextLine();
        String inst=sc.nextLine();
        StringBuilder sb=new StringBuilder();    
        int id=sc.nextInt();
        int y=0;
        for(int i=0;i<=id;i++){
            char ch=ogst.charAt(i);
            sb.append(ch);

        }
       sb.append(inst);
        for(int i=id+1;i<ogst.length();i++){
            sb.append(ogst.charAt(i));
        }
        String new_string=sb.toString().trim();
        System.out.println("new string is "+new_string);
    }
}
