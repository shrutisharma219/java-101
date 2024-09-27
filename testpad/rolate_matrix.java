package testpad;
import java.util.*;
public class rolate_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int [][]a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int s = 0;
            int e = m - 1;

            while (s < e) {
                int q = a[i][s];
                a[i][s] = a[i][e];
                a[i][e] = q;
                s++;
                e--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

    }
    
}
