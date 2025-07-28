package Generics.Generics_and_polymorphism;

public class Main {
    public static void main(String[] args) {
        //对于已经定义好类型的接口就可以直接new
        A a = new A();
        //对于没有定义好类型的接口需要使用泛型
        B<Integer> b = new B<>();
    }
    //我们调用了一个接口,那么可以将接口里面的泛型给定义出来
    //也就是在implements是要把类型确定好,也可以继续使用泛型
    //以下是定义好类型的方法
    public static class A implements Study<String> {
        @Override
        public String test(){
            return null;
        }
    }
    //以下是继续使用泛型的
    public static class B<T> implements Study<T> {
        @Override
        public T test(){
            return null;
        }
    }
}
