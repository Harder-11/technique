package Interface_basic;


//注意,接口也可以进行继承操作
//而且和类不同,接口可以一次性继承多个接口
public interface A extends B {
    void hello();
    //并且接口里面不能去重写Object里面定义的成员的
    //所以下属语句会报错
    //default boolean equals(Object obj){}
}
