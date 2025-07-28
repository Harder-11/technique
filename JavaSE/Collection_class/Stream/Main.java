package Collection_class.Stream;

import java.util.*;
import java.util.stream.Collectors;

/*
Stream流
Stream使用一种类似用SQL语句从数据库查询数据的直观方式来提供一种对Java集合运算和表达的高阶抽象
Stream流相当于提前先把所有的步骤先预备好,然后调用Stream直接处理所有的要求
 */

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>(Arrays.asList("XZJ","AA","Aaaa","a","Msn","Lbwnb","Aaaa"));
        //我现在有以下要求:删除长度不大于3的字符串
        //删除首字母不为大写的字符串
        //去掉重复字符串
        //我们利用filter是不过滤,并且使用distinct来去重,最后collect收集所有的满足条件的
        list = list.stream()
                .filter(str -> str.length() > 3)
                .filter(str -> str.charAt(0) >= 'A' && str.charAt(0) <= 'Z')
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
