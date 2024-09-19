package syntax_basics;

public class string_function1 {
    public static void main(String[] args) {
        
        String str=new String("Hello");
        int len=str.length();
        boolean isEqual = str.equals("Hello"); // Returns true
        System.out.println("is equal "+isEqual);
        boolean isEqualCase = str.equalsIgnoreCase("hello"); // Returns true
        System.out.println("is equal "+isEqualCase);
        int comparison = str.compareTo("World"); // Returns a negative value
        
        char ch='e';
        String st="LO";
        int index = str.indexOf(ch);
        int indexcase = str.indexOf(st.toLowerCase());
        System.out.println("index is "+index);
        System.out.println("index is case  "+indexcase);
        int lastIndex = str.lastIndexOf("l"); // Returns 3

        String sub = str.substring(1); // Returns "ello"
        String subRange = str.substring(1, 4); // Returns "ell"
        String concatenated = str.concat(" World"); // Returns "Hello World"
        String lower = str.toLowerCase(); // Returns "hello"
//end index is not counted......

        StringBuffer sb = new StringBuffer("Hello");
        int leng = sb.length(); // Returns 5
        int cap = sb.capacity(); // Default is 16, increases as needed
        sb.append(" World"); // Modifies sb to "Hello World"
        sb.insert(5, ","); // Modifies sb to "Hello, World"
        sb.delete(5, 6); // Modifies sb to "Hello World"
        sb.replace(5, 11, "Everyone"); // Modifies sb to "Hello Everyone"
        sb.reverse(); // Modifies sb to "enoyrevE olleH"
















 



        


    }
}
