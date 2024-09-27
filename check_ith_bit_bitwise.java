import java.util.*;

public class check_ith_bit_bitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=1;
        int i=sc.nextInt();
        f=f<<i;
        int a=n&f;
        if(a==1){
            System.out.println("yes the ith bit is set ");
        }
        else{
            System.out.println("no its not ");
        }
    }
    
}
