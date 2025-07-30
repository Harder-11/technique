package Reflection.Class_class;



/*
Class类详解
类的加载会提起一个类的信息生成Class对象放在内存中,而反射机制实际就是利用这些存放的类信息,
来获取类的信息和操作类
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取类对应的Class对象
        Class<Student> c = Student.class;
        //也可以按照以下来获取对象,由于getClass()方法里面就是public final Class<?> getClass()
        //所以只能传入通配符
        Class<?> c1 = new Student().getClass();
        //还可以使用forName()方法获取
        Class<?> c2 = Class.forName("Reflection.Class_class.Student");

        //基本数据类型也有Class对象,但是和对应的包装类型的Class不一样
        Class<?> i = int.class;
    }
}
