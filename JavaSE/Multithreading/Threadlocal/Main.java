package Multithreading.Threadlocal;



/*
ThreadLocal使用
可以用来创建工作内存中的变量,将我们的变量储存在内部(只能储存一个变量),不同的线程访问到ThreadLocal对象的时候
都只能获取到当前线程所属的变量
 */
public class Main {
    public static void main(String[] args) {
        ThreadLocal<String> local = new ThreadLocal<>();
        //可以储存值,而且可以取出
        local.set("Hello world!");
        //System.out.println(local.get());

        //也可以进行继承
        ThreadLocal<String> l = new InheritableThreadLocal<>();
        l.set("HELLO MSN");

        new Thread(() -> {
            //但是在另外的线程里面去取ThreadLocal就无法取到
            //在哪个线程里面设定的值就只能在这个线程里面取到
            System.out.println(local.get());

            //这里只是继承了外部线程的ThreadLocal类,但是肯定无法修改
            l.set("HELLO XZJ");
        }).start();

        //发现无法在其他线程里面进行修改
        System.out.println(l.get());
    }
}
