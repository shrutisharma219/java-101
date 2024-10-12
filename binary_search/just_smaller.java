package binary_search;

import java.util.Scanner;

public class just_smaller {
    static int justsmaller(int [] a,int n, int k){
        int s=0;
        int e=n-1;
        int r=-1;
        while(s<=e){
            int mid =s+(e-s)/2;
            if(a[mid]==k){
                return mid;
            }
            else if(a[mid]<k){
                 r=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return a[r];
        // int low = 0, high = arr.length - 1;
        // int result = -1;  // Default if no smaller number is found.

        // while (low <= high) {
        //     int mid = low + (high - low) / 2;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

        //     if (arr[mid] < key) {
        //         // If we find a smaller element, record it as a potential result.
        //         result = arr[mid];
        //         low = mid + 1;  // Try to find a larger number that is still smaller than the key.
        //     } else {
        //         high = mid - 1;  // We need a number smaller than the key, move left.
        //     }
        // }

        // return result;  // Return the closest smaller number, or -1 if not found.
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
        int ans=justsmaller(a,n,k);
        System.out.println("ans is "+ans);
}}

