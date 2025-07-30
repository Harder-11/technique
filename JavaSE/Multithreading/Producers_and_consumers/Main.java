package Multithreading.Producers_and_consumers;


import java.util.*;

/*
通过多线程来模拟
一个餐厅里面有3个顾客和2个厨师,假设厨师炒一个菜的时间为3s,顾客吃一个菜的时间为4s
 */
public class Main {

    public static Queue<Object> q = new LinkedList<>();

    public static void main(String[] args) {
        new Thread(Main::add,"厨师1").start();
        new Thread(Main::add,"厨师2").start();
        new Thread(Main::take,"消费者1").start();
        new Thread(Main::take,"消费者2").start();
        new Thread(Main::take,"消费者3").start();
    }
    //生成方法
    private static void add(){
        while (true) {
            try {
                Thread.sleep(3000);
                synchronized (q) {
                    String name = Thread.currentThread().getName();
                    System.out.println(new Date() + " " + name + "出餐了");
                    q.offer(new Object());
                    q.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private static void take(){
        while (true) {
            //必须要有餐品才能拿
            try {
                synchronized (q) {
                    //这里保证了顾客一定能拿到餐
                    while (q.isEmpty()) q.wait();
                    q.poll();
                    String name = Thread.currentThread().getName();
                    System.out.println(new Date() + " " + name + "拿到了餐品");
                }
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
