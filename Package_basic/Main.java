//必须package引入才知道这个Java程序属于哪个包
package Package_basic;

//我想要引入Pak.person这个类,那么必须要import他才行
//如果二者在同一个包下可以不import
import Package_basic.Pak.Person;

//我们可以直接导入一个静态方法,因为静态方法是属于类的,那么直接类.方法名就可以了
import static Package_basic.Pak.Person.test;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        /*这里注意访问权限控制
        一共有如下的四种访问权限,总结如下:
                     当前类  同一个包下的类  不同包的子类  不同包下的类
        public       √      √            √           √
        protected    √      √            √           ×
        默认          √      √            ×           ×
        private      √      ×            ×           ×
        */
        //那么显然我们如果Pak.Person里面都是默认的话,Main和Pak.Person不在同一个包下
        //那么肯定不能访问到Pak.Person这个类
        //将权限改成public就可以使用了
        p.name = "MSN";
        test();
    }
}
