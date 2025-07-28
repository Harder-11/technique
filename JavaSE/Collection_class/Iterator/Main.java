package Collection_class.Iterator;

import java.util.*;

/*
迭代器
所有的集合类都是可以使用for_each语法的
注意:迭代器是一次性的,用了一次之后不能再用了,需要重新去生成一个新的迭代器
 */

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>(Arrays.asList("A","B","C"));
        //最朴素的遍历方式
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        //for_each遍历,其实本质就是使用list的迭代器在进行遍历操作
        for(String s : list){
            System.out.println(s);
        }
        //和下面的代码同理,反编译即是下述代码
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //也可以使用lambda表达式遍历,使用foreach方法
        list.forEach(str -> System.out.println(str));

        //自己写的继承自Iterable都可以for_each遍历
        Test t = new Test();
        for(String s : t){
            System.out.println(s);
        }
    }

    //注意,只要是继承自Iterable的类都可以使用迭代器进行遍历
    public static class Test implements Iterable<String> {
        @Override
        public Iterator<String> iterator() {
            return new Iterator<String>() {
                @Override
                public boolean hasNext() {
                    return true;
                }

                @Override
                public String next() {
                    return "MSN";
                }
            };
        }
    }
}
