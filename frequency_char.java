import java.util.Scanner;

public class frequency_char {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        char[] a = new char[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next().charAt(0);
        }
        int[] freq = new int[26];
        for (int i = 0; i < n; i++) {
            freq[a[i] - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0)
                System.out.println((char) (i + 'a') + " " + freq[i]);
        }
    }

































    
}
