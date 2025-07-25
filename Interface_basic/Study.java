package Interface_basic;


/*
创建接口
我们想要抽象出study这个行为,就类似于抽象类里面单独写一个抽象方法,然后使子类去重新父类方法一个道理
所以在接口里面,我们的方法直接默认是public abstract,所以可以省略写这两个单词
 */
public interface Study {
    //和抽象类一样,接口里面的抽象方法也不能有主体(body)
    //这样就把study这个行为给抽象出来了
    void study();
    //Java8之后可以使得抽象方法默认实现(也就是提前实现好)
    default void test(){
        System.out.println("我是默认实现");
    }
    //接口不同于类,不能拥有成员变量和成员方法,但是可以有静态变量和静态方法
    //同理,静态变量和方法也是属于这个接口的
    //注意:接口里面的静态变量都是默认的public static final类型,可以省略
    //静态方法都是默认public,可以省略
    int a = 10;
    static void exam(){
        System.out.println("我是静态方法");
    }
}
