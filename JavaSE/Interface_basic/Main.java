package Interface_basic;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //这里由于Student实现了Study接口,我们可以把它当做Study来使用
        //当然此时我们也只能使用Study里面定义过的抽象方法
        Study student = new Student("MSN",114,"女");
        student.study();
        //通过default默认实现的抽象方法
        student.test();
        //注意不能是println(student.a),因为a是静态变量,属于接口而不是属于对象
        System.out.println(Study.a);
        //接口同样是满足向下转型的
        if(student instanceof Student){
            Student ss = (Student) student;
        }

        //演示clone方法
        Student s = new Student("MSN",114,"女");
        //从Object强制转化为Student,但是clone只是克隆出来的,和本身地址是不一样的
        Student clone = (Student) s.clone();
        System.out.println(s);
        System.out.println(clone);
        System.out.println(s == clone);

        /*
        注意,拷贝分为深拷贝和浅拷贝
        对于浅拷贝,对于类中的基本数据类型会直接复制值给拷贝对象,而引用类型则是直接复制
        对象的地址,实际上指向的还是原来那个对象
        对于深拷贝,无论是引用还是基本类型都是拷贝成一个新的对象,包括对象里面的所有成员变量
        而clone是浅拷贝,我们测试一下name是否一样即可
         */
        System.out.println(s.name == clone.name);
    }
}
