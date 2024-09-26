class d extends Thread{
    public void run(){
        String n=Thread.currentThread().getName();
        for(int i=0;i<3;i++){
            System.out.println(n);
        }
    }
}

public class multithreading3 {
    public static void main(String[] args) {
        d t1=new d();
        d t2=new d();
        d t3=new d();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        t1.start();
        t2.start();
        t3.start();
    }   
}
