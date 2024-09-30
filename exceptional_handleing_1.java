public class exceptional_handleing_1 {
    public static void main(String[] args) {
        int a[]=new int[5];
        try {
            int r=5/0;
            System.out.println(a[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out of bound element");
        }
        catch(ArithmeticException e){
            System.out.println(e.getStackTrace());
            System.out.println((e.getMessage()));
            System.out.println(e);
        }
        System.out.println("after try catch ");






    }       
}
