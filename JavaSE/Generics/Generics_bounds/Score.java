package Generics.Generics_bounds;


/*
泛型的界限,现在有一个新的要求,现在没有String类型的成绩了,但是成绩依然是
可能整数,可能小数,这时我们不希望用户将泛型指定为除数字以外的其他类型,我们就需要使用泛型的上界定义
 */

//我们把T泛型继承自Number类即可实现只有数字的可能
public class Score<T extends Number> {
    String name;
    String id;
    T value;

    public Score(String name, String id, T value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
