package Multithreading.Priority;



/*
线程的优先级
 */
public class Main {
    public static void main(String[] args) {
        //为线程建立优先级,使用.setPriority即可
        Thread t = new Thread(() -> {
            System.out.println("线程开始运行");
        });
        t.setPriority(Thread.MAX_PRIORITY);
        //t.start();

        //我们还可以再线程工作不重要的时候将CPU资源让位给其他线程,使用yield()方法将资源
        //让位给其他同优先级的线程
        Thread t1 = new Thread(() -> {
            System.out.println("线程1开始运行! ");
            for(int i = 0; i < 50; i++){
                if(i % 5 == 0){
                    System.out.println("让位! ");
                    Thread.yield();
                }
                System.out.println("1打印" + i);
            }
            System.out.println("线程1结束!");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("线程2开始运行");
            for(int i = 0; i < 50; i++) {
                System.out.println("2打印" + i);
            }
        });

        Thread t3 = new Thread(() -> {
            System.out.println("线程3开始运行");
            for(int i = 0; i < 50; i++){
                System.out.println("3打印");
                if(i == 10){
                    try {
                        System.out.println("1加入此线程");
                        //这个join是让1加入,先完成1所有的内容,然后继续当前内容
                        t1.join();
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }
}
