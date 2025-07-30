package Reflection.Call_class_method;


/*
利用反射来调用类的方法
 */

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ReflectiveOperationException {
        Class<Student> c = Student.class;
        //这里传入的是方法名
        Method test = c.getMethod("test");
        //使用invoke()方法即可调用
        test.invoke(new Student("MSN",18));

    }
}
