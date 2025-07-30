package Reflection.Create_class_object;


import java.lang.reflect.Constructor;

/*
创建类对象
既然我们已经拿到了类的定义,那么就可以通过Class对象来创建对象,调用方法,修改变量
 */
public class Main {
    public static void main(String[] args) throws ReflectiveOperationException {
        Class<Student> c = Student.class;
        //通过反射创建对象,这样只满足无参构造,并且不推荐使用
//        Student s = c.newInstance();
//        s.test();

        //如果是有参构造,那么可以用getConstructor()
        Constructor<Student> constructor = c.getConstructor(int.class);
        Student s = constructor.newInstance(114);

        //反射非常强大的地方,即使使用的类里面是private修饰符,也可以获取到并且调用
        Constructor<Student> c1 = c.getDeclaredConstructor(String.class,int.class);
        //将其设定为可以访问
        c1.setAccessible(true);
        Student s1 = c1.newInstance("MSN",114);
        s1.test();
    }
}
