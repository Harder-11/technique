package Generics.Empty_packaging;

import java.util.Optional;

/*
判空包装
Java8新增了一个非常重要的判空包装类Optional,这个类可以很有效的处理空指针问题
 */
public class Main {
    public static void main(String[] args){
        test(null);
    }
    private static void test(String str){
//        //此时传入的值为null,调用方法马上得到空指针异常
//        if(!str.isEmpty()){
//            System.out.println("字符串的长度为: " + str.length());
//        }
        //get方法可以获取被包装的对象的引用,但是如果为空的话,会抛出异常
        String ss = Optional.ofNullable(str).get();
        System.out.println(ss);

        //可以使用orElse使用备选方案,也就是如果是空的话就选择备选方案
        String sss = Optional.ofNullable(str).orElse("备选方案");
        System.out.println(sss);

        //我们可以使用Optional类,优雅地处理这种问题
        Optional
                .ofNullable(str)
                .ifPresent(s -> {
                    if(!s.isEmpty()){
                        System.out.println(s.length());
                    }
                });
    }
}
