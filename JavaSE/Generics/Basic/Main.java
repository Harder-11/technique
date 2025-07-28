package Generics.Basic;

public class Main {
    public static void main(String[] args) {
        Score s1 = new Score("高数","114",90);
        Score s2 = new Score("计网","514","优秀");
        //这样虽然可以进行类型转化不报错,因为都是Object子类,但是运行时会报错
        Integer num = (Integer) s2.value;
        System.out.println(num);
    }
}
