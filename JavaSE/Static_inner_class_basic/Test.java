package Static_inner_class_basic;

/*
静态内部类
其实就是把内部的类改成static,这个静态类其实就是属于外部类的,而不是属于某个对象,和静态类的定义是一样的
 */
public class Test {
    private final String name;
    public Test(String name){
        this.name = name;
    }
    //此时静态内部类不能去访问外部非静态变量
    public static class Inner {
        public void test(){
            System.out.println("我是静态内部类");
        }
    }
}
