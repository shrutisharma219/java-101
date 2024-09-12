import java.util.Scanner;

public class my{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  // Creating a Scanner object
        String str = sc.nextLine();           // Reading input from the user
        System.out.println(str);              // Printing the input
        sc.close();                           // Closing the Scanner object
    }
}
