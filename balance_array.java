import java.util.*;

public class balance_array {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int l = a[0];
        int r = a[n - 1];
        int j = n - 1;
        int c = -1;
        int i = 0;
        int x = 2;
        for (int z = 0; z < n; z++) {
            if (l > r) {
                j--;
                r += a[j];
                x++;
            } else if (l < r) {
                i++;
                l += a[i];
                x++;
            } else if (l == r) {
                c = i + 1;
            } else {
                j++;
                i++;
                r += a[j];
                l += a[i];
            }
            if (i >= j) {
                break;
            }
        }
        // while(i<=j){
        // if(l>r){
        // j--;
        // r+=a[j];

        // x++;
        // }
        // else if(l<r){
        // i++;
        // l+=a[i];

        // x++;
        // }
        // else if(l==r){
        // c=i+1;
        // }
        // else{
        // j++;
        // i++;
        // r+=a[j];
        // l+=a[i];
        // }
        // }
        System.out.println("ans is " + c);


















    
    }
}
