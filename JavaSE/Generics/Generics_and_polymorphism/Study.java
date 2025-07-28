package Generics.Generics_and_polymorphism;


/*
不止类可以使用泛型,接口也可以使用
(当然继承也是一个道理,所以不单独展示了)
 */
public interface Study<T> {
    T test();
}
