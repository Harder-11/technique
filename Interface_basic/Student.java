package Interface_basic;

//我们要使得类去访问接口,就需要implements关键字
//注意:接口里面的抽象方法必须要实现,否则要报错
//接口的好处就是一个类可以一次性访问多个接口

//这里演示Cloneable的实现,进行对象的复制实现
public class Student extends Person implements Study, Cloneable {
    public Student(String name,int age,String sex){
        super(name,age,sex);
    }
    @Override
    public void study(){
        System.out.println("我学习比较佛系");
    }

    //这里重写是为了将protected改成public,方便使用
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
