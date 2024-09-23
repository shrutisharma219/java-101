import java.util.Scanner;

public class string_to_stringarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String []st=s.split(" ");
        for(int i=0;i<st.length;i++)
        System.out.print(st[i]+" ");
    }
    
}
