package Multithreading.Creation_and_start_up;



/*
线程的创建和启动
 */
public class Main {
    public static void main(String[] args) {
        //创建线程,而且我们要告诉线程要做什么事情,使用new Runnable来重写即可
        //main是JVM自己创建的一个主线程,我们创建的这个线程thread其实就是和主线程平行的一个线程,它们同时在运行
        Thread thread = new Thread(() -> {
            System.out.println("我是线程" + Thread.currentThread().getName());
            System.out.println("我在计算 0-50之间所有数的和");
            int sum = 0;
            for(int i = 0; i <= 50; i++){
                sum += i;
            };
            System.out.println("1到50的和为:" + sum);
        });
        //启动线程,这样线程才会开始执行
        thread.start();
        //同时在主线程里面进行测试
        System.out.println("我是主线程! ");
    }
}
