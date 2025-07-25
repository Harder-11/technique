package Encapsulation_basic;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("MSN",114,"女");
        //这里只有使用封装好的getter函数才能拿到名字,使用person.name是无法得到的
        //这样就可以确保信息不会被改动
        System.out.println(person.getName());
        person.setName("XZJ");
        System.out.println(person.getName());
    }
}
