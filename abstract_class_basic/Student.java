package abstract_class_basic;

//注意,当父类是抽象类的时候,子类必须去重写抽象方法,这样保证方法有用
public class Student extends Person {
    public Student(String name,int age,String sex){
        super(name,age,sex);
    }

    //必须重写否则报错
    @Override
    public void exam() {
        System.out.println("我是学生");
    }
}
