package Member_inner_class_basic;

public class Main {
    public static void main(String[] args) {
        //首先创建外部类,在外部类的基础上创建成员内部类
        Test t = new Test("MSN");
        Test.Inner i = t.new Inner();
        //然后就可以直接访问成员内部类里面的方法
        i.test();
    }
}
