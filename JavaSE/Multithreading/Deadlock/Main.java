package Multithreading.Deadlock;




/*
死锁
指的两个线程互相拥有对方需要的锁,但是又不释放,导致程序卡住
 */
public class Main {
    public static void main(String[] args) {
        //以下代码就形成了一个死锁
        Object o1 = new Object();
        Object o2 = new Object();
        Thread t1 = new Thread(() -> {
            synchronized(o1) {
                try {
                    Thread.sleep(1000);
                    synchronized (o2){
                        System.out.println("线程1");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized(o2) {
                try {
                    Thread.sleep(1000);
                    synchronized (o1){
                        System.out.println("线程2");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
    }
}
