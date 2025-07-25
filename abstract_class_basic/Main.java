package abstract_class_basic;

public class Main {
    public static void main(String[] args) {
        //注意抽象类不是具体的类定义,可能会存在某些方法没有实现,因此不能new来创建对象
        //所以只能new其子类,因为子类已经重写了抽象方法,不会存在有没有实现的方法(子类必须重写所有抽象方法)
        Person person = new Student("MSN",114,"女");
    }
}
