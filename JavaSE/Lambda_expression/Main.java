package Lambda_expression;

public class Main {
    //如果一个接口里面有且只有一个待实现的抽象方法,那么我们可以将匿名内部类简写为lambda表达式
    public static void main(String[] args) {
        //在初学阶段直接把Lambda看做匿名内部类的简写即可,规范如下
        //([参数类型 参数名称,]...) -> {代码语句,包括返回值}
        //和匿名抽象类不同,lambda表达式只支持接口,不支持抽象类
        //接口内部必须有且仅有一个抽象方法
        int a = 10;
        Study s = () -> {
            System.out.println("我是学习方法");
            return "今天学会了" + a;
        };
        System.out.println(s.study());

        //测试方法引用,由于Java自带的一些方法,我们可以直接用在Lambda表达式里面进行简化
        //使用::表示即可
        Sum sum = Integer::sum;
        System.out.println(sum.sum(1,2));

        //只要方法的返回值和参数一样,我们都可以使用方法引用
        Main main = new Main();
        Study s1 = main::lbwnb;
        System.out.println(s1.study());

        //甚至可以直接把构造方法拿来进行方法应用
        Study s2 = String::new;
    }
    public String lbwnb(){
        return "给阿姨倒一杯卡布奇诺";
    }
}
