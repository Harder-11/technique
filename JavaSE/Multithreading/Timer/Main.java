package Multithreading.Timer;


import java.util.Timer;
import java.util.TimerTask;

/*
定时器
有时候我希望程序定时执行任务,比如3s之后运行,那么我们可以使用Thread.sleep()实现
主要要抛出InterruptedException

而我们如果要循环执行一次任务,每次都要间隔1s执行,那么就可以将单次执行放入到一个无限循环里面即可
但是Java提供了一套自己的框架来处理定时任务,可以更方便解决问题
 */
public class Main {
    public static void main(String[] args) {
        //创建定时器对象
        Timer t = new Timer();
        //注意这是一个抽象类而不是接口,不能使用lambda表达式,只能使用匿名内部类
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("我是延迟任务");
            }
        },1000,1000);//这里的参数是延时1s,而且每1s执行一次

        //注意如果不取消定时器的话就不会结束线程,必须使用cancel()
        t.cancel();
    }
}
