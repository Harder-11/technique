package Inherit_basic;


public class Main {
    public static void main(String[] args) {
        Student student = new Student("MSN",114,"女");
        student.study();
        //我们也可以子类当做父类来用,只不过无法再调用子类的方法
        //注意这里的person只是当做父类使用而已,不代表子类变成父类了
        Person person = new Student("XZJ",514,"男");
        //此时无法调用study()
        //我们尝试调用职业,发现会是学生
        System.out.println(person.profession);
        //我们也可以使用强制类型转换,把一个被当做父类使用的对象转为子类(向下转型)
        //这样转化只适合原本就是Student类型的情况
        Student s = (Student) person;

        //如何想要判断某个变量所引用的对象到底是什么类,可以使用instanceof来判断
        //如果这个类是某个类的子类的话,也会判断出来是True
        if(person instanceof Student){
            System.out.println("我是Student类型的");
        }
        if(person instanceof Person){
            System.out.println("我是Person类型的");
        }

        //进行测试,如果Worker里面单独有一个和父类一样的成员变量name
        //那么现在传入的名字就是父类的而不是子类,调用的work()由于就近取name,没有被赋值也就是null
        Worker w = new Worker("MSN",114,"女");
        w.work();
    }
}
