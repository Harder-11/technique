package Inherit_basic;


/*
定义类的时候可能有一些相同的属性,为了方便使用可以将这些属性抽象成一个父类
在定义其他子类的时候可以继承父类,减少代码的重复定义,子类可以使用父类中非私有的成员

 */
public class Person {
    String name;
    int age;
    String sex;
    String profession;

    //如果父类存在一个有参的构造方法,子类必须在构造方法中进行调用(super)
    //因为子类在构造的时候不仅要初始化子类的属性还要初始化父类的属性,在默认情况下,子类其实
    //是调用了父类的构造方法的,只是在无参的情况下可以进行省略,但是父类的构造方法有参数时就需要手动指定了
    public Person(String name,int age,String sex,String profession){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.profession = profession;
    }
    void test(){}
}
