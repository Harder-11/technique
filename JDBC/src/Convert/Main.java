package Convert;


import java.lang.reflect.Constructor;
import java.sql.*;

/*
将数据库查询结果转化为对象
 */
public class Main {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/study","root","123456")) {
            Statement statement = connection.createStatement();
            ResultSet set = statement.executeQuery("select * from student");
            while(set.next()){
                Student s = new Student(set.getInt(1),set.getString(2),set.getString(3));
                s.say();
            }
            //也可以用下述反射的方法进行转化
            while(set.next()){
                Student s = convert(set,Student.class);
                s.say();
            }

        } catch (SQLException e){
            e.printStackTrace();
        }


    }
    //我们也可以利用反射不用区分类型地进行查询结果的转换
    private static <T> T convert(ResultSet set,Class<T> c) {
        try {
            //获取c的一个构造方法(这里只取了第一个构造器的参数列表作为目标)
            //那么就获取到了第一个构造方法的类型数组,然后创建类型数组大小的Object数组
            //一个一个往Object里面填入即可
            Constructor<T> constructor = c.getConstructor(c.getConstructors()[0].getParameterTypes());
            Class<?>[] param = constructor.getParameterTypes();
            Object[] objects = new Object[param.length];
            for(int i = 0; i < param.length; i++){
                //注意JDBC的下标从1开始
                objects[i] = set.getObject(i + 1);
                if(objects[i].getClass() != param[i]){
                    throw new SQLException("错误的类型转换: " + objects[i].getClass() + " -> " + param[i]);
                }
            }
            return constructor.newInstance(objects);
        } catch (SQLException | ReflectiveOperationException e) {
            e.printStackTrace();
            return null;
        }
    }
}
