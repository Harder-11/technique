package Rewrite_basic;


/*
方法的重写是覆盖原有方法的实现,比如我们现在不希望使用Object类中提供的equals方法
那么我们就将其重写(也就是在子类里面把父类实现过的方法通过重写给覆盖掉)
 */

//类也可以加上final,可以保证类无法被继承(public final class Person)
public class Person {

    //对应成员变量也可以使用final修饰,如果变量没有初始值,那么就只有在构造方法里面进行一次赋值
    //如果直接就有初始值,那么构造方法里面都不能进行赋值
    final String name;
    int age;
    String sex;


    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    //在重写的时候使用@Override,而且要保证参数和返回值和父类是一模一样的
    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(obj instanceof Person){
            Person person = (Person) obj;
            return this.name.equals(person.name) &&
                    this.age == person.age &&
                    this.sex.equals(person.sex);
        }
        return false;
    }

    //通过重新,也可以体现出面向对象编程中多态特性
    //不同的子类通过不同的重写方案,最后可以得到不同结果
    public void test(){
        System.out.println("我是人");
    }

    //如果不希望子类重新某个方法,那么在方法前添加final关键字,表示这个方法已经是最终形态
    public final void exam(){
        System.out.println("我是考试方法");
    }
}
