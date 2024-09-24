import java.util.Scanner;

public class remove_leading_zero_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        boolean b=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0' && b==false){
                b=true;
            }
            if(b==true){
                sb.append(s.charAt(i));
    }
}
        System.out.println("string without leading zeros are "+sb);
    }   
}
