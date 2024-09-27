public class exceptional_handling_3 {
    public static void main(String[] args) {
        int a[]=new int[5];
        System.out.println("before try catch");
        try{
            System.out.println(a[10]);
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("in the catch ");
        }
        finally{
            System.out.println("always running ");
        }
    }
    
}
