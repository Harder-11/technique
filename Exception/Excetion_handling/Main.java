package Exception.Excetion_handling;


/*
当程序没有按照我们理想的样子运行而出现异常的时候(默认会交给JVM处理,JVM发现任何异常都会立即终止
程序,并在控制台打印栈追踪信息),现在我们希望能自己处理出现的问题,让程序运行下去,就需要对异常进行捕获
 */
public class Main {
    public static void main(String[] args) {
        //使用try-catch进行异常捕获
        //try里面的语句块相当于是被监控的范围,如果发生了异常就会被捕获掉
        try {
            Object object = null;
            object.toString();
        } catch (NullPointerException e){ //因为异常本身也是一个对象,catch中实际就是用一个局部变量去接收异常
            //在catch语句块中可以对捕获到的异常进行处理,比如打印栈追踪信息
            e.printStackTrace();
            System.out.println("异常错误信息: " + e.getMessage());
        }
        System.out.println("程序继续正常运行");

        try {
            test(1,0);
        } catch (ArithmeticException e){

        }

        //对于编译时异常,在main方法里面必须自己处理,如果在main还往上抛异常就会交给
        //JVM处理了,这样就会中断程序
        try {
            exam(1,0);
        } catch (Exception e){
            e.printStackTrace();
        }

        //有可能出现许多异常,可以将catch写在一起
        //但是要注意顺序,catch只会匹配到最初匹配到的异常,后面的直接跳出了,相当于if-else
        //如果下面代码RuntimeException放在前面的话,就会直接报错,因为越界异常就不可能被捕获
        try {
            int[] arr = new int[10];
            arr[-1] = 10;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界");
        } catch (NullPointerException e){

        } catch (RuntimeException e){
            System.out.println("我是运行时异常");
        }

        //如果我们希望程序运行的时候,无论是否发生异常,都会在最后执行任务,可以交给finally语句处理
        try {
            int[] arr = new int[10];
            arr[-1] = 10;
            //这里可以简化用|将异常隔开
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e){
            System.out.println("数组越界");
        } finally {
            System.out.println("我肯定会被执行");
        }
    }
    private static int test(int a,int b){
        return a / b;
    }

    //对于编译时异常,必须进行处理,可以抛给上一级处理也可以直接处理
    private static int exam(int a,int b) throws Exception {
        if(b == 0){
            throw new Exception("除数不能为0");
        }
        return a / b;
    }
}
