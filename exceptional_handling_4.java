public class exceptional_handling_4 {
    public static void main(String[] args) {
        int age =200;
        try {
            if(age>100){
                throw new myexp("this is error");
            }
             
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class myexp extends Exception{
    public myexp(String message){
        super(message);
    }
}
