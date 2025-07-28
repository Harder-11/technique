package Collection_class.Set;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
set和C++里面的unordered_set是一样的
 */
public class Main {
    public static void main(String[] args) {
        //HashSet,底层是哈希表实现的,会自动去重,并且并不是按照插入顺序排放
        Set<String> s = new HashSet<>();
        s.add("AAA");
        s.add("AAA");
        System.out.println(s);

        //LinkedHashSet,可以按照插入顺序来进行遍历
        Set<String> s1 = new LinkedHashSet<>();
        s1.add("AAA");
        s1.add("CCC");
        s1.add("BBB");
        for(String x : s1){
            System.out.println(x);
        }

        //TreeSet和C++中的set是一样的,会自动排序,底层是红黑树
        //当然也可以给一个比较器控制排序
        Set<Integer> ss = new TreeSet<>();
        ss.add(3);
        ss.add(2);
        ss.add(10);
        for(int x : ss){
            System.out.println(x);
        }
    }
}
