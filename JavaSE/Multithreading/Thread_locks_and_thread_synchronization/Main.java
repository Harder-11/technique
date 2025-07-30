package Multithreading.Thread_locks_and_thread_synchronization;


/*
线程锁和线程同步
线程之间的共享变量是储存在主内存中的,而每个线程都有一个私有的工作内存
工作内存中存储了该线程以读/写贡献变量的副本,类似于高速缓存机制

但是如果多个处理器都运算任务设计同一块内存区域,那么就可能导致各自的高速缓存的数据不一样,在写回主内存的时候就回发生冲突
也就是引入高速缓存引发的新问题,称之为缓存一致性

 */

public class Main {
    private static int value = 0;

    //如果是静态方法,那么就使用当前对象作为锁即可
    private static synchronized void add(){
        value++;
    }
    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();
        //为了解决上面所述的问题,可以使用线程锁,使用synchronized代码块
        //括号里面必须是一个对象或者类
        //线程锁,传入了一个对象或者类,相当于将这个类当做一个锁,当一个线程拿到锁之后就可以进行
        //synchronized里面的代码块,而另外的线程就会拿不到这个锁,那么就会被卡在原地
        //也可以加到方法上面
        new Thread(() -> {
            for(int j = 0; j < 100000; j++){
                synchronized (o) {
                    value++;
                }
            }
        }).start();

        new Thread(() -> {
            for(int j = 0; j < 100000; j++){
                synchronized (o) {
                    value++;
                }
            }
        }).start();

        Thread.sleep(1000);
        System.out.println(value);
    }
}
