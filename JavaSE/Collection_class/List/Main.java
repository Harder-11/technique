package Collection_class.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
List列表
List列表(线性表),支持随机访问
List是集合类型的一个分支,它的主要特性有:
1.是一个有序的集合,插入元素默认是插入到尾部,按顺序从前往后存放,每个元素有一个自己的下标位置
2.列表中允许存在重复元素(是equals方法判断相同)
 */
public class Main {
    public static void main(String[] args) {
        //使用集合类一般是使用其接口(List)
        List<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        System.out.println(list.get(0));
        System.out.println(list.contains("AAA"));
        System.out.println(list.remove("AAA"));

        String[] arr = list.toArray(new String[0]);

        //还可以一次加入一堆元素
        List<String> l = new ArrayList<>();
        l.addAll(Arrays.asList("AAA","BBBB","CCCCCC","DD"));
        //删除所有长度大于等于3的元素
        l.removeIf(s -> s.length() >= 3);
        System.out.println(l);

        //实现LinkedList,也是用接口实现
        //在LinkedList的底层实现其实就是双向链表,每个节点存了prev和next的结点
        //而且还定义了first(不带头结点)和last两个节点
        List<String> l1 = new LinkedList<>();

    }
}
