package binary_search;

import java.util.Scanner;

public class just_greater {
    static int justgreater(int [] a,int n, int k){
        int s=0;
        int e=n-1;
        int r=-1;
        while(s<=e){
            int mid =s+(e-s)/2;
            if(a[mid]==k){
                return mid;
            }
            if(a[mid]>k){
                 r=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return a[r];
    
    }
     public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter key to search ");
        int k=sc.nextInt();
        int ans=justgreater(a,n,k);
        System.out.println("ans is "+ans);
}}
