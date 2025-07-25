package Static_inner_class_basic;

public class Main {
    public static void main(String[] args) {
        //由于静态内部类就是Test类上是一个属性,那么直接new即可
        Test.Inner i = new Test.Inner();
    }
}
