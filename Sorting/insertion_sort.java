package Sorting;
import java.util.*;
public class insertion_sort {
    public static void main(String[] args) {
            int n;
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            int []a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }

            for(int i=1;i<n;i++){
                int z=a[i];
                int j=i-1;
                while(j>=0 && a[j]>z){
                    a[j+1]=a[j];
                    j--;
                }
                a[j+1]=z;
            }


































            
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }      

    }
}
