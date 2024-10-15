package binary_search;

import java.util.Scanner;

public class peak_mountain_array {
static int mountain(int a[], int n){
    int s=0;
    int e=n-1;
    while(s<=e){
        int mid=s+(e-s)/2;
        if(a[mid]>=a[mid-1] && a[mid]>=a[mid+1]){
            return mid;
        }
        else if(a[mid]>=a[mid-1]){
            s=mid+1;
        }
        else{
            e=mid-1;
        }
    }
    return 0;
}
         public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ans=mountain(a,n);
        System.out.println("ans is "+ans);
 
























































        
} }
