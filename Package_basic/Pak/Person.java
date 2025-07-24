package Package_basic.Pak;


//注意普通类不能使用protected和private修饰符
//因为我们目前使用的普通类要么只给当前包里面使用,要么给外面使用,那么用private的话这个类就没有意义了
public class Person {
    public String name;
    int age;
    String sex;
    //静态方法可以静态导入属于其他包的文件里面去
    public static void test(){
        System.out.println("Here is a test");
    }
}
