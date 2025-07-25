package Anonymous_inner_class_basic;

public class Main {
    public static void main(String[] args) {
        //本身对于一个抽象类来说,不能直接去new一个对象
        //那么我们可以通过如下的匿名内部类来实现对象的创建
        //为什么叫做匿名内部类,因为我们再调用的时候方法都还没有实现
        //本身我们是需要子类来继承之后实现方法的,但是我们可以不继承就使用
        Student s = new Student() {
            //这里相当于就是一个类,可以往其中添加成员变量
            @Override
            public void test() {
                //这里也可以访问到原本Student抽象类里面的成员变量
                System.out.println("我是匿名内部类的实现" + name);
            }
        };
        //匿名内部类同样可以使用类中的属性,因为他本质上就相当于是对应类型的子类
        s.test();

        //同理对于接口也可以进行匿名内部类实现
        Study st = new Study() {
            @Override
            public void study() {
                System.out.println("我是接口");
            }
        };
        st.study();
    }
}
