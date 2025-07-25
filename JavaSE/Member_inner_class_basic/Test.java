package Member_inner_class_basic;

/*
成员内部类
在一个类里面继续定义一个类,把新定义的这个类当做外面类的一个成员
注意:在成员内部类中是可以访问到外层的变量的
 */
public class Test {
    //内部类也是类,也可以有成员变量和方法
    //成员内部类和成员方法,变量一样,都是对象所有的,而不是类所有的
    class Inner {
        public void test(){
            //在内部类里面可以使用外部的成员方法和变量
            System.out.println("我是内部类:" + name);
        }
    }
    private final String name;
    public Test(String name){
        this.name = name;
    }
}
