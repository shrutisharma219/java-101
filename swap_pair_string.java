import java.util.Scanner;

public class swap_pair_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length()/2;i++){
            sb.append(s.charAt(j+1));
            sb.append(s.charAt(j));
            j+=2;
            if(j==s.length()-1 ){
                sb.append(s.charAt(j));
            }
        }
        System.out.println("swaped string is "+sb);
    }
    
}
