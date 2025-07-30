package Reflection.Create_class_object;

public class Student {
    String name;
    int age;

    public Student(int age){
        this.age = age;
    }

    private Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void test(){
        System.out.println(name + " " + age);
    }
}
