package Interface_basic;

public class Test implements A {
    //这里A由于继承了B接口,那么必须重写A和B中所有的抽象方法
    @Override
    public void hello(){}

    @Override
    public void test(){}
}
