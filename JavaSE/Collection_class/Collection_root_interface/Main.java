package Collection_class.Collection_root_interface;

/*
集合根接口
直接使用Java包装好的ArrayList类即可
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(0,"MSN");
        list.add(1,"XZJ");
        System.out.println(list);
    }
}
