package Reflection.Class_class_and_polymorphism;


import java.lang.reflect.Type;
import java.util.ArrayList;

/*
Class对象和多态
 */
public class Main {
    public static void main(String[] args) {
        Object str = new String();
        //判断对象是否是对应的类型,可以使用instanceof,也可以使用getClass()判断
        System.out.println(str.getClass() == String.class);
        //可以使用asSubclass来判断是不是子类
        str.getClass().asSubclass(Object.class);

        //而且可以获取父类,父类的父类...
        Class<?> c = ArrayList.class.getSuperclass();
        System.out.println(c);

        //还可以获得所有的接口,返回值是Class类型的数组
        Class<?>[] c1 = ArrayList.class.getInterfaces();
        for(Class x : c1) {
            System.out.println(x);
        }

        //还可以获取父类的原始数据类型
        Type t = ArrayList.class.getGenericSuperclass();
        System.out.println(t.getClass());
    }
}
