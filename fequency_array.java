import java.util.*;


public class fequency_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int []a=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]>max){
                max=a[i]
;            }
        }
        int []freq=new int[max+1];
        for(int i=0;i<n;i++){
            freq[a[i]]++;
        }
        for(int i=0;i<=max;i++){
            if(freq[i]>0){
                
            System.out.println(i+" "+freq[i]);
            
        }}
    }
    
}
