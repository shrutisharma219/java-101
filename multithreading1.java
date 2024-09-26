
class a extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("int the thread");
        }
    }
}

public class multithreading1 {
    public static void main(String[] args) {
        a t=new a();
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("in then main function");
        }
    }
}
