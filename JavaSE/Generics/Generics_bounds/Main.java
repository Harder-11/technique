package Generics.Generics_bounds;

public class Main {
    public static void main(String[] args) {
        //被限定了泛型上界,如果使用非数字类型就不行
        Score<Integer> score = new Score<>("MSN","114",1);
        //也可以继续使用通配符?,并且在通配符里面也可以继续限定上界
        //但是在这个上界肯定只有是Number及其子类才行,否则就是冲突的
        Score<? extends Number> s = new Score<>("XZJ","514",2);

        //如果限定的是上界,那么由于其子类各种各样,不能直接用set方法来设置类型
        //s.setValue(10);

        //泛型下界使用super关键字,但是只能在通配符这里用,不能在类定义或者方法定义时用
        Score<? super Integer> s1 = new Score<Integer>("MSN","114",1);
        //而限定下界时就可以使用set方法,因为最低都是Number类型的,只要设定为Number类型都是通用的
        s1.setValue(10);
    }
}
