package Reflection.Modify_class_attributes;


import java.lang.reflect.Field;

/*
修改类的属性
 */
public class Main {
    public static void main(String[] args) throws ReflectiveOperationException {
        Class<?> c = Class.forName("Reflection.Modify_class_attributes.Student");
        //首先拿到Field对象,注意这里的Field获取只支持public
        Field name = c.getField("name");
        //如果不是public也可以使用getDeclaredField,然后setAccessible
        System.out.println(name.get(new Student("MSN", 114)));

        //我们甚至可以使用反射修改final修饰的类型
        Student s = new Student("MSN",114);
        Field f = Student.class.getDeclaredField("age");
        f.setAccessible(true);
        f.set(s,30);
        s.test();
    }
}
