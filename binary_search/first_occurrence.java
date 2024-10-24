package binary_search;
import java.util.*;
// Other imports go here
// Do NOT change the class name
class first_occurrence{
  public static int binary(int []a,int k){
    int s=0;
    int e=a.length-1;
    int ans=-1;
    while(s<=e){
      int mid=s+(e-s)/2;
      if(a[mid]==k){
        ans=mid;
        e=mid-1;
      }
      else if(a[mid]<k){
        s=mid+1;
      }
      else{
        e=mid-1;
      }
    }
    return ans;
  }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int s;
      s=sc.nextInt();
      for(int l=0;l<s;l++){
        int n=sc.nextInt();
        int k=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
        }
        int ans=binary(a,k);
        System.out.println(ans);
      }
        // Write your code here
    }
} 
