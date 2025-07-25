package Package_class_basic;

public class Main {
    public static void main(String[] args) {
        /*
        Java并不是纯面向对象的语言,因为Java中的基本数据结构不是面向对象的,Java中的基本类型
        如果想通过对象的形式去使用它们,Java提供了基本类型的包装类,使得Java能更好地体现面向对象的思想
        同时也能使得基本类型能够支持操作对象
         */
        //这里演示把10包装成一个Integer类型的变量,但是这种写法在Java 9之后被废除了
        //所以这里会进行警告,已经被废弃的语法,但是可以运行
        Integer i = new Integer(10);
        System.out.println(i);
        //同时以下两种写法是等效的,保证类型支持自动装箱,可以直接将一个对应的基本类型转为对应保证类型引用变量的值
        Integer a = 10;
        Integer b = Integer.valueOf(10);
        //既然能装箱,也可以拆箱,将Integer转为int类型,可以随时相互转换
        int c = a * a;
        /*
        面试常考
        注意,IntegerCache会默认缓存-128~127里面的所有值,将这些值提前做成包装类放在数组中
        存放,会直接让-128~127之间的值自动装箱为Integer类型的对象,那么始终会得到同一个对象(底层在返回内就不会new)
        所以可以测试Integer 127和128之间用等号比较的结果
        下属结果一个是true,一个是false
         */
        Integer d = Integer.valueOf(127);
        Integer e = Integer.valueOf(127);
        Integer f = Integer.valueOf(128);
        Integer g = Integer.valueOf(128);
        System.out.println(d == e);
        System.out.println(f == g);
    }
}
