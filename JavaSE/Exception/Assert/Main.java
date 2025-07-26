package Exception.Assert;


/*
断言表达式
如果assert后面表达式结果直接是false的话,会直接出现一个断言错误
可以在调试的时候进行判断
 */
public class Main {
    public static void main(String[] args) {
        int a = 10;
        assert a > 10;
    }
}
