import java.util.Scanner;

public class wood_log {
     public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int x=0;
        int z=n-1;
        
        for(int i=0;i<n;i++){
            if(a[i]==1){
                
                if(a[i+1]==0){
                    break;
                }
                x++;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(a[i]==1){
                if(a[i-1]==0){
                    break;
                }
                z--;
            }
        }
        System.out.println("ans is "+(z-x));

    
}
}