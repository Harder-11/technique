package Inherit_basic;


//使用extends关键字来进行继承操作,此时Worker就是Person子类
//Person就是Worker超类/父类

public class Worker extends Person {
    //子类可以定义和父类同名的属性
    //定义和父类一样的name属性
    String name;
    public Worker(String name,int age,String sex){
        super(name,age,sex,"工人");
    }

    //这里的name如果不取super,由于就近取name,没有被赋值,也就是null
    //存在同名变量的情况要访问父类就要使用父类,使用super.name即可
    public void work(){
        System.out.println("我是" + super.name + ",我在工作");
    }
}
