package testpad;
import java.util.*;
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
        char tempArray[] = s.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);
        String ss=new String(tempArray);

        // Returning new sorted string
        System.out.println(ss);
        char c='c';
        int ab=(int)c;
        System.out.println(ab);
        // ArrayList<String> subStringList 
        //     = SubstringsOfAString.splitSubstrings( 
        //         stringInput); 
        


        //ArrayList<String> stringList = new ArrayList<>(Arrays.asList(inputString.split(" ")));

        // Step 1: Split the string into an array of substrings
// String[] stringArray = inputString.split(" ");

// // Step 2: Convert the array to a List
// List<String> stringListAsList = Arrays.asList(stringArray);

// // Step 3: Create an ArrayList from the List
// ArrayList<String> stringList = new ArrayList<>(stringListAsList);

    }
    
}
