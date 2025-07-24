package Class_basic;

public class Person {
    String name;
    int age;
    String sex;
    /*
    静态变量是属于这个类的,也可以理解为所有对象共享的内容,用static关键字声明一个变量或者内容
    一旦被声明为静态,那么通过这个类创建的所有对象,操作的都是同一个目标,也就是说对象再多,也只有
    这一个静态的变量或者方法,一个对象改变了静态变量的值,那么其他对象的读取就是被改变的值
    */
    static String info;
    void hello(){
        System.out.println("HELLO MY NAME IS " + name);
    }
    int add(int a,int b){
        return a + b;
    }
    //重载必须参数类型不同,仅返回值不同是不行的
    double add(double a,double b){
        return a + b;
    }
    void modify(Person person){
        person.name = "WHY";
    }
    //使用this让当前对象的变量值等于参数传入的值
    //如果不使用this,也就是name = name,Java会自动识别为最近的name,也就是传入参数的那个name
    void setName(String name){
        this.name = name;
    }
    Person(){}
    //构造方法,每个类都有一个默认的构造方法
    Person(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    /*
    静态方法和静态变量同理,我们可以直接用类去使用静态方法,而不用创建对象去使用
    并且静态方法无法使用其他非静态方法
    为什么?因为静态方法是类具有的属性,而成员变量是某个对象具有的属性,比如小明这个人才叫做小明
    用静态方法去访问具体对象肯定是错误的,同样的,在静态方法里面是无法使用this关键字的,因为this
    关键字表示当前对象本身
    但是静态方法可以调用静态变量

    在创建类的时候,静态变量已经静态代码块是最先被初始化的,然后才是成员变量以及成员方法
    */
    static void test(){
        System.out.println("I love you");
        //不能使用非静态方法
        //add(2,3);
        //但是可以调用静态变量
        System.out.println("静态变量的值为:" + info);

    }
}
