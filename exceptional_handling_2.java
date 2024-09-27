public class exceptional_handling_2 {
    public static void main(String[] args) {
        int []a=new int[5];
        try {
            System.out.println(a[4]);
            
        } catch (Exception e) {
            System.out.println("int the catch block ");
            System.out.println(e);
        }

    }
}
