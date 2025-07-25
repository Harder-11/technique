package Rewrite_basic;

public class Worker extends Person {
    public Worker(String name,int age,String sex){
        super(name,age,sex);
    }
    @Override
    public void test(){
        System.out.println("我是工人");
    }


}
