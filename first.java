import java.util.Scanner;

public class first{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("entered number was "+n);
        int a=10;
        byte b=20;
        float fl=10.20f;
        double d=10.20;
        long l=378204l;
        //by default it is in double so that why we use f and l
        char c='A';
        sc.nextLine();
        String s=sc.nextLine();
        System.out.println("string is "+s);
        int g=150;
        byte v=(byte)(g);
        System.out.println("type conversion of int g into v "+v);
        int ab='a';
        System.out.println("the automatic conversion of char into int "+ab);
        double ans=(a+c)*(fl*d)+(l+a);
        System.out.println((a+c)+" "+(fl*d)+" "+(l+a));
        System.out.println(ans);
        //the automatic type conversions happens from small type to large type
                
    }
}
