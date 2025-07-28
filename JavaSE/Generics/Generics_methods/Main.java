package Generics.Generics_methods;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String str = test("MSN");
        System.out.println(str);

        //将数组从大到小排序,依然需要利用泛型
        //而利用泛型排序必须是Integer[]类型的
        Integer[] a = {1,3,2,4,5};
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(a));
    }
    /*
    泛型方法,类型变量并不是只能在泛型类里面使用,我们可以定义泛型方法
    当某个方法(无论是静态方法还是成员方法)需要接受的参数类型并不确定的时候,我们可以使用泛型表示
    将泛型写在类型的前面即可
    */
    public static <T> T test(T t){
        return t;
    }
}
