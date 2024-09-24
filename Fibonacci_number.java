import java.util.Scanner;
public class Fibonacci_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        boolean t=false;
        while(c<=n){
            c=a+b;
            a=b;
            b=c;
            if(c==n){
                t=true;
                System.out.println("the number is fibo "+n);
}
        }
        if(t==false){
            System.out.println("this is not fibo "+n);
        }
    }
    
}
