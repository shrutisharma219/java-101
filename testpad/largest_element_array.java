package testpad;
import java.lang.reflect.Array;
import java.util.*;
public class largest_element_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("largest is "+a[a.length-1]);

    }
    
}
