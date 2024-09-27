package testpad;
import java.util.*;
public class second_largest_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
    int l=Integer.MIN_VALUE;
    int l2=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        if(a[i]>l){
            l2=l;
            l=a[i];
        }
        else if(l2<a[i] && a[i]!=l){
            l2=a[i];
        }
    }
    System.out.println("largest is "+l+" and  second largest is "+l2);
    
    }
    
}
