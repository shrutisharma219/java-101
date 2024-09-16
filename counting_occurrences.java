import java.util.Scanner;
public class Counting_occurrences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no with occurrences");
        int no=sc.nextInt();
        System.out.println("enter number to count ");
        int a=sc.nextInt();
        int c=0;
        int n=no;
        while(n>0){
            int rem=n%10;
            if(rem==a){
                c++;
            }
            n=n/10;
            
        }
        System.out.println("to check the ");
        System.out.println("no of occurrence of "+a+" in "+no+" is "+c);
    }
}
