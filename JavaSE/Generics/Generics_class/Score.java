package Generics.Generics_class;

/*
泛型类
泛型其实就是一个待定类型,我们可以使用一个特殊的名字表示泛型
泛型在定义的时候并不明确是什么类型,而是需要到使用的时候才会确定对应的类型
 */

//泛型类使用<>,在里面添加1~N个类型变量即可
public class Score<T> {
    String name;
    String id;
    //T会根据使用时提供的类型自动变成对应类型
    T value;

    //这里T可以是任何类型,但是一旦确定,就不能修改了,比Object更加严谨
    public Score(String name, String id, T value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    //在get方法里面还是用泛型,在创建对象的时候就知道泛型的具体类型是什么了
    public T getValue() {
        return value;
    }

    //注意,静态方法和变量是不能使用泛型的,因为静态是属于类本身的,如果本身都没定义
    //好变量类型那肯定是不合法的
    //static T a;
}
