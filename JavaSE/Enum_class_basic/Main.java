package Enum_class_basic;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        //我们设定的时候直接用Status.来调取可以使用的字符串类型
        student.setStatus(Status.SLEEP);
        System.out.println(student.getStatus());
        Student s = new Student();
        s.setStatus(Status.RUNNING);
        System.out.println(s.getStatus().getName());
    }
}
