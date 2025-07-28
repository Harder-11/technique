package Generics.Type_erasure;

public class Main {
    public static void main(String[] args) {
        //对于泛型类来说,我们可以不定义泛型的类型,默认就是Object
        Score s = new Score<Integer>("114","514",1);
        //使用默认就可以进行任意类型转化,都是Object类型
        s.setValue("MSN");
        System.out.println(s.getValue());

        A<String> a = new B();
    }
    public static class B extends A<String> {
        @Override
        public String test(String s){
            return null;
        }
    }
}
