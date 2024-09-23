import java.util.Scanner;

public class palindrome_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int s=0;
        int e=st.length()-1;
        boolean b=true;
        while(s<e){
            if(st.charAt(s)!=st.charAt(e)){
                b=false;
                break;

            }
            s++;
            e--;
        }
        if(b)
        System.out.println("Yes it is "+st);
        else
        System.out.println("no it is not "+st);
    }
}
