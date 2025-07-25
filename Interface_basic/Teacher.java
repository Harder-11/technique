package Interface_basic;

public class Teacher extends Person implements Study {
    public Teacher(String name,int age,String sex){
        super(name,age,sex);
    }
    public void study(){
        System.out.println("我学的更厉害一点");
    }
}
