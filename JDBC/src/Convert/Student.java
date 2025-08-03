package Convert;


/*
注意,创建的类里面的数据类型要和数据库里面的内容一致
 */
public class Student {
    Integer sid;
    String name;
    String sex;

    public Student(Integer sid, String name, String sex) {
        this.sid = sid;
        this.name = name;
        this.sex = sex;
    }

    public void say(){
        System.out.println("我叫: " + name + ", 学号是: " + sid + ", 性别是: " + sex);
    }
}
