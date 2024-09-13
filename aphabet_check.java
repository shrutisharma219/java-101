import java.util.Scanner;
public class aphabet_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().trim().charAt(0);
if(ch>='a' && ch<='z'  || ch>='A' && ch<='Z'){
    System.out.println("yes it is a alpahbet "+ch);

}
else{
    System.out.println("no its not "+ch);
}
    }
}
