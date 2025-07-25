package Rewrite_basic;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("MSN",114,"女");
        Person p2 = new Person("MSN",114,"女");
        //这里进行方法重写之后判断对象的name,age,sex是否分别都相同从而判断对象是否相同
        //如果不重新的话返回false
        System.out.println(p1.equals(p2));
        //通过重写体现多态性
        //注意这里重写之后new出来的是什么对象,调用的就是什么对象的函数
        //new出来的是Student,那么会打印我是学生,其余同理
        Person p3 = new Student("MSN",114,"女");
        p3.test();
        p3 = new Worker("XZJ",514,"男");
        p3.test();
        p3 = new Person("MSN",114,"女");
        p3.test();
    }
}
