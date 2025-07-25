package Rewrite_basic;

public class Student extends Person {
    public Student(String name,int age,String sex){
        super(name,age,sex);
    }

    @Override
    public void test() {
        //注意我们也可以在类里面进行super操作调用父类原本实现的方法
        //super.exam();
        //super.test();
        System.out.println("我是学生");
    }
}
