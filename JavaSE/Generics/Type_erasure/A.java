package Generics.Type_erasure;


/*
在Java中其实并不是真的有泛型类型,因为所有的对象都属于一个类型,在一个泛型类型编译之后
实际上会直接使用默认的类型,比如没有现在的T,就是Object,如果有上限就是上限类型
 */
public abstract class A <T> {
    abstract T test(T t);
}
