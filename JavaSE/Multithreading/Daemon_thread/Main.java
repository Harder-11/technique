package Multithreading.Daemon_thread;


/*
守护线程
当其他所有非守护线程结束之后,守护线程自动结束
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread main = Thread.currentThread();

        Thread t = new Thread(() -> {
            try {
                //主线程结束之后守护线程也跟着结束了
                while(true){
                    System.out.println("我是守护线程");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e){
                throw new RuntimeException();
            }
        });

        //将t设定为守护线程
        t.setDaemon(true);
        t.start();

        Thread.sleep(3000);
    }
}
