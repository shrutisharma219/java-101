import java.util.Scanner;
public class even_length_words {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
       String st;
       st=sc.nextLine();
       String [] s=st.split(" ");
       StringBuilder sb=new StringBuilder();

       for(String word: s){
        if(word.length()%2==0){
            sb.append(word);
            sb.append(" ");
        }
       }
      String new_string= sb.toString().trim();
      System.out.println("new string is "+new_string);

    }
}
