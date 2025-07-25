package abstract_class_basic;


/*
抽象类
越是在顶层定义的类越可以进行抽象,比如说Person里面的exam方法
这个方法在子类里面一定会被重写,所以说除非子类调用父类的实现,否则一般情况下永远不会被调用,就想我们说一个人
会不会考试一样,实际上人怎么考试是一个抽象的概念,学生怎么考试和工人怎么考试是一个具体的实现,所以说我们
可以将人类进行进一步的抽象,让某些方法完全由子类来实现,父类中不需要提供实现

使用abstract关键字,表示这个类是一个抽象类,也就可以在类里面定义抽象方法
抽象类一般只用作继承,并且抽象方法不能是private限制,因为这样子类无法重写,没有任何意义
 */
public abstract class Person {

    String name;
    int age;
    String sex;


    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(obj instanceof Rewrite_basic.Person){
            Person person = (Person) obj;
            return this.name.equals(person.name) &&
                    this.age == person.age &&
                    this.sex.equals(person.sex);
        }
        return false;
    }

    public void test(){
        System.out.println("我是人");
    }

    //抽象方法,是由子类来实现的而不是父类实现
    //所以父类里面的方法不能有body
    public abstract void exam();
}