
class a extends Thread{
    @Override
    public void run(){
        try {
            for(int i=0;i<5;i++){
                System.out.println("int the thread");
                Thread.sleep(1000);
            }

        } catch (InterruptedException i) {
        }
        
    }
}

public class multithreading1 {
    public static void main(String[] args) throws InterruptedException {
        a t=new a();
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("in then main function");
            Thread.sleep(1000);
        }
    }
}
