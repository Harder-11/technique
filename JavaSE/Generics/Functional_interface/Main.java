package Generics.Functional_interface;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
函数式接口就是JDK1.8专门给我们提供好的用于Lambda表达式的接口
这些接口都可以使用lambda表达式

1.Supplier供给型函数式接口:专门用于供给使用的,其中只有一个get方法用于获取需要的对象
2.Consumer消费型函数式接口:专门用于消费某个对象的
3.Function函数型函数式接口,这个接口消费一个对象,然后向外供给一个对象
4.Predicate断言型函数式接口,接受一个参数,然后进行自定义判断并返回一个boolean结果
 */
public class Main {
    private static final Consumer<Student> STUDENT_CONSUMER = student -> System.out.println(student + "真好吃!");
    private static final Function<Integer,String> INTEGER_STRING_FUNCTION = Objects::toString;
    private static final Predicate<Student> STUDENT_PREDICATE = student -> student.score >= 60;
    public static void main(String[] args) {
        //定义Supplier,专门供给Student对象,可以使用lambda也可以使用匿名内部类
        Supplier<Student> studentSupplier = () -> new Student();
        studentSupplier.get().hello();

        //定义Consumer
        Student s = new Student();
        STUDENT_CONSUMER
                //andThen是后续操作实现,在调用完accept之后才输出andThen里面的内容
                .andThen(st -> System.out.println("对吧"))
                .accept(s);

        //定义Function,有两个参数,第一个就是要使用的类型,第二个就是要转化为的类型
        //下面就是定义的将Integer使用toString方法转化为String类型
        String str = INTEGER_STRING_FUNCTION.apply(10);
        System.out.println(str);
        //还可以使用compose方法,将该函数式的返回值作为当前实现的实参
        //意思就是把apply里面传入的String类型先使用方法转为Integer,再进行转化
        String str1 = INTEGER_STRING_FUNCTION
                .compose((String ss) -> ss.length())
                .apply("lbwnb");
        System.out.println(str1);

        Student s1 = new Student();
        s1.score = 80;
        if(STUDENT_PREDICATE.test(s1)){
            System.out.println("及格了");
        } else {
            System.out.println("不及格");
        }
    }

}
