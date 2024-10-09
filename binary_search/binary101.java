package binary_search;

import java.util.Scanner;

public class binary101 {
    static int binary(int []a, int n,int k){
        int s=0;
        int e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(a[mid]<k){
                e=mid-1;

            }
            else if(a[mid]>k){
                s=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;

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
        int ans=binary(a,n,k);
        System.out.println("ans is "+ans);
    }
    
}
