package testpad;

public class replace_char {
    public static void main(String[] args) {
        String s="thename";
        char ch='q';
        int d=2;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i!=d){
                sb.append(s.charAt(i));
            }
            else
            sb.append(ch);
        }
        System.out.println("new string is "+sb);
    }
    
}
