class c implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("inner ");
        }
    }
}

public class multithreading2 {
    public static void main(String[] args) {
        c r=new c();
        Thread t=new Thread(r);
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("main function ");
        }
    }
    
}
