package Inherit_basic;

public class Student extends Person {

    //可以直接继承父类里面的test()方法
    //也可以有自己独有的方法,比如study()方法
    public void study(){
        System.out.println("我是学生,我叫: " + name);
    }

    //父类中有有参数的构造方法,那么子类需要按照同样的方式调用父类的构造方法
    //而且super必须是第一条语句,也就是必须先继承之后再进行其他操作
    public Student(String name,int age,String sex){
        super(name,age,sex,"学生");
    }
}
