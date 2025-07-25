package Encapsulation_basic;


/*
类的封装
封装的目的是为了保证变量的安全性,使用者不必在意具体的实现细节,而只是通过外部的接口即可访问类的成员
如果不进行封装,类中的实例变量可以直接查看和修改,可能给整个代码带来不好的影响
因此在编写类的时候一般将成员变量私有化,外部需要使用Getter和Setter方法进行查看和设置变量
 */
public class Person {
    private String name;
    private int age;
    private String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    //使用get方法的好处是,我们将所有的成员变量私有化,这样其他人就无法改变值,只能进行调用
    public String getName() {
        return name;
    }

    //我们也可以在方法中进行一些额外的操作,比如可以修改名字但是名字中不能包含小这个字
    public void setName(String name){
        if(name.contains("小")) return;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}
