package Class_basic;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Person a = new Person();
        a.name = "MSN";
        a.age = 114;
        a.sex = "女";
        System.out.println(a.name + " " + a.age + " " + a.sex);
        //对象直接赋值是引用,相当于int &b = a,b和a共用一个内存,b改变导致a改变
        Person b = a;
        b.name = "XZJ";
        //测试改b是否影响a
        System.out.println(a.name);
        a.hello();
        System.out.println(a.add(1,2));
        System.out.println(a.add(1.5,2.5));
        //构造方法里面直接就有内容
        Person c = new Person("XZJ",514,"男");
        System.out.println(c.age);

        //测试静态变量,由于static属于类的变量,是所有类共享的变量
        //那么a的info设置为TEST,其他所有的Person类的info都会变成TEST
        Person d = new Person();
        a.info = "TEST";
        System.out.println(d.info);
        //静态方法测试,不需要对象即可使用,因为静态方法是属于类的而不是对象
        Person.test();
    }
}
