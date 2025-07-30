package Multithreading.Sleep_and_interrupt;

/*
线程的休眠和中断
当一个线程处于运行状态的时候,下一个状态会出现如下的可能性
1.CPU给予的时间片结束了,会从运行状态变成就绪状态,等待下一次获得CPU资源
2.当线程进入休眠/阻塞/手动调用wait(),线程处于等待状态,当等待状态结束以后会回到就绪状态
3.当线程出现异常或者错误/被stop()强制停止/所有代码结束的时候,线程会终止
 */
public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                //如果在休眠时候被其他线程打了中断标记,那么直接抛出异常,并且进行中断操作
                Thread.sleep(10000);
            } catch (InterruptedException e){
                System.out.println("我被中断了!");
                e.printStackTrace();
            }
        });

        Thread t1 = new Thread(() -> {
            //如果是在正在运行的线程,那么使用isInterrupted来判断时候被打了中断标记即可
           while(true){
               if(Thread.currentThread().isInterrupted()){
                   System.out.println("我被打了中断标记,需要立即停止!");
                   break;
               }
           }
        });

        t.start();
        t1.start();

        try {
            Thread.sleep(2000);
            t.interrupt();
            t1.interrupt();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
