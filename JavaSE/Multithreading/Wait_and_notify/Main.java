package Multithreading.Wait_and_notify;



/*
wait和notify方法
他们都需要配合synchronized来进行使用的,实际上锁就是依附于对象存在的
每个对象都应该有针对于锁的一些操作,所以说就这样设计了,当然只有在同步代码块中
才能使用这些方法,正确情况下会报错

使用wait()会使得线程进入等待状态,而且把锁给让出来,其他线程就可以获取到此对象的锁
当其他线程调用notify之后,会唤醒刚刚变成等待状态的线程,注意,必须是在所持有锁的线程中使用,否则会抛出异常
 */
public class Main {
    public static void main(String[] args) {
        Object o1 = new Object();
        new Thread(() -> {
            synchronized (o1) {
                try {
                    System.out.println("线程开始");
                    Thread.sleep(1000);
                    //wait相当于是进入等待状态,而且可以设定等待状态的时间的
                    //而且可以在等待的时候被中断
                    o1.wait();
                    System.out.println("线程1结束");
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (o1) {
                System.out.println("我拿到锁了!");
                //这里使用notify唤醒刚刚变成等待的状态,但是此时唤醒的线程依然没有锁
                //要等到此线程运行完才有锁
                o1.notify();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("线程2结束");
            }
        }).start();
    }
}
