package Generics.Generics_class;

public class Main {
    public static void main(String[] args) {
        //在定义泛型对象的时候也是使用<>,在其中添加数据类型
        Score<String> s = new Score<>("计网","114","优秀");
        System.out.println(s.getValue());

        //如果要让某个变量支持确定了任意类型的泛型,那么可以使用 ? 通配符
        //但是任意类型本质就是Object类
        Score<?> s1 = new Score<>("高数","514",1);

        //如果要调用有多个泛型的类,那么需要按照顺序把所有类型都规定好
        Test<Integer,Character,String> t = new Test<>();
    }
}
