package Enum_class_basic;

//对于枚举类,我们直接在里面写每个状态的名字即可
//而枚举是一个普通类,自然也可以在里面写一些构造函数以及变量
//注意,如果枚举里面写了构造函数以后,前面的几个列举字符串就需要加上参数

public enum Status {
    //这样在每个字符串后面加上括号和参数,表示如果命名为RUNNING,枚举类的name就变成了跑步
    RUNNING("跑步"),STUDY("学习"),SLEEP("睡觉");
    private final String name;
    Status(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
