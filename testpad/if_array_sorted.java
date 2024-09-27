package testpad;
import java.util.*;
public class if_array_sorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        boolean t=false;
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
                t=true;
            }
        }
        if(t==true){
            System.out.println("not sorted ");
        }
        else
        System.out.println("sorted ");
    
}}
