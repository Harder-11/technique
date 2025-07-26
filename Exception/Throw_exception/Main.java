package Exception.Throw_exception;


import java.io.FileNotFoundException;

/*
异常的抛出同样需要创建一个异常对象出来,我们抛出异常实际上就是将这个异常对象抛出
异常对象携带了我们抛出异常时的一些信息,比如是因为什么原因导致的异常,在RuntimeException的构造方法
中可以写入原因

 */
public class Main {
    public static void main(String[] args) {
        test(1,0);
        //在发现异常之后,后面代码就不会继续运行,在此中断
        System.out.println("代码到达此处");
    }
    private static int test(int a,int b){
        //异常也是对象,需要new一个异常出来
        ArithmeticException e = new ArithmeticException("除数不能为0");
        //当b == 0,会出异常,那么特判b == 0,然后抛出异常即可
        //但是通常都是在抛异常的时候才new一个异常出来
        if(b == 0){
            throw new ArithmeticException("除数不能为0");
        }
        return a / b;
    }

    //如果我们在方法中抛出了一个非运行时异常,那么必须告知函数的调用方我们会抛出某个异常
    //函数调用方必须要对抛出的这个异常进行对应的处理才行(因为非运行时异常不处理会报错)
    //调用方可以继续向上层抛异常或者利用try-catch解决异常
    private static void exam() throws Exception {
        throw new Exception("我是编译时异常");
    }

    //如果不同的分支会抛出不同的异常,那么需要将所有的异常都注明
    private static void test(int a) throws FileNotFoundException, ClassNotFoundException {
        if(a == 1){
            throw new FileNotFoundException();
        } else {
            throw new ClassNotFoundException();
        }
    }
}
