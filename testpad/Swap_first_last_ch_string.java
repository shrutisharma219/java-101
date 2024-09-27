package testpad;

public class Swap_first_last_ch_string {
    static String swapFirstLastChar(String str) {
        // Write your code here
        StringBuilder sb=new StringBuilder();
        String[] s=str.split(" ");
        for(String w:s){
          
          if(w.length()>-1){
          char st=w.charAt(0);
          char e=w.charAt(w.length()-1);
          String mid=w.substring(1,w.length()-1);
          sb.append(e).append(mid).append(st);
          }
        else{
          sb.append(w);
        }
          sb.append(" ");
        }
        return sb.toString().trim();
      }
    
    public static void main(String[] args) {
String s="the name is";
String ans=swapFirstLastChar(s);
System.out.println("ans is "+ans);
    }
}
