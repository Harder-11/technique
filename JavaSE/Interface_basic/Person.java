package Interface_basic;


/*
接口比抽象类还要抽象,他只代表某个确切的功能,也就是只包含方法的定义,甚至不是一个类
接口一般只代表某些功能的抽象,接口包含了一些类方法的定义,类可以实现这个接口,表示类支持接口代表的功能
比如说,对于人类的不同子类,学生和老师来说,他们都具有学习这个能力,既然都有,那么我们可以将学习这个能力抽象成一个接口
来进行使用,只要是实现这个接口的类都具有学习的能力
 */
public class Person {
    String name;
    int age;
    String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    @Override
    public String toString() {
        return String.format(
                "Person{name='%s', age=%d, sex='%s'}",
                name, age, sex
        );
    }
}
