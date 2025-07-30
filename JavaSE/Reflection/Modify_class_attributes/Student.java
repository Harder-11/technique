package Reflection.Modify_class_attributes;

public class Student {
    public String name;
    public final int age;
    public Student (String name,int age){
        this.name = name;
        this.age = age;
    }
    public void test(){
        System.out.println(name + " " + age);
    }
}
