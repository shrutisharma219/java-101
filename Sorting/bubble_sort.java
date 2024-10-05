package Sorting;
import java.util.*;
public class bubble_sort {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        

        for(int i=0;i<n;i++){
            boolean b=false;
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                    b=true;
                }
            }
            if(b==false){
                
                break;
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    

    }
    
}
