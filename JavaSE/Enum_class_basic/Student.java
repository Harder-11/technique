package Enum_class_basic;


/*
枚举类
假设我们想给人添加一个状态(跑步,学习,睡觉),外部可以实时获取状态
但是如果完全按照以前的使用getter和setter方法的话,就会出现问题
我们仅仅是储存字符串,外部可以不按照我们的规则传入一些其他的字符串,这显然是不够严谨的
我们希望开发者拿到使用的是我们定义好的状态,所以这就需要我们使用枚举类来完成
 */
public class Student {
    //对于枚举,我们直接把变量类型改成枚举名字即可
    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
