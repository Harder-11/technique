package Generics.Basic;

/*
为了统计学生的成绩,要求设计一个Score对象,包括课程名称,课程号,课程成绩
但是成绩分为两种,一种是以优秀,良好,合格来作为结果,还有一种是以60.0,75.0这样的数字作为分数
可能高等数学以数字作为成绩,而计网以等级结算,两种分数类型都可能出现,那么该如何去实现Score这个类呢

现在的问题就是成绩可能是String,也可能是Integer类型的,如何很好地去存可能出现的两种类型呢
 */
public class Score {
    String name;
    String id;
    //Object是所有类型的父类,既可以存放String,也可以存放Integer
    //虽然这种方法可以解决多种类型储存问题,但是Object类型在编译阶段不具有良好的类型判断能力
    //也就是我们使用Object的话不清楚存储的对象到底是什么类型的
    Object value;

    public Score(String name, String id, Object value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }
}
