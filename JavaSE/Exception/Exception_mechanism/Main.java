package Exception.Exception_mechanism;

/*
异常的类型
1.运行时异常:在编译阶段无法感知代码是否会出现问题,只有在运行的时候才会知道出不出错
这样的异常称为运行时异常,异常也是由类来定义的,所有运行时异常都继承自RuntimeException
2.编译时异常:必须要处理的异常,否则会报错,所有编译时异常都是继承自Exception
 */

public class Main {
    public static void main(String[] args) {
        //调用test,抛出异常,0不能作为除数
        test(1,0);
    }
    private static int test(int a,int b){
        return a / b;
    }
}
