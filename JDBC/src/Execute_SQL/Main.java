package Execute_SQL;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        //首先使用Connect连接数据库,使用DriverManager驱动器连接数据库,主要要填写数据库,用户以及密码,否则无法登录数据库
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/study","root","123456")){
            //创造一个用于执行SQL的Statement对象
            Statement statement = connection.createStatement();
            //执行SQL语句,并得到结果集,DQL一般使用executeQuery()
            //可以使用executeUpdate来进行修改操作,返回的就是生效的行数
//            int i = statement.executeUpdate("insert into student values(114514,'CNM','男')");
//            System.out.println("生效了:" + i + "行");
            statement.executeUpdate("delete from student where sid = 114514");

            //使用DQL,使用ResultSet接收,最开始的set指针并不在第一行,需要调用next()之后才到达第一行,其实和迭代器差不多
            ResultSet set = statement.executeQuery("select * from student");
            while(set.next()){
                //这里填一个参数,就是代表输出的那一行在哪一列,也可以直接填String类型代表这行是什么
                System.out.println(set.getInt(1));
            }
            //为了加快运行效率,我们还可以批处理,使用addBatch(),最后统一处理
            statement.addBatch("insert into teacher values(114,'TS','男')");
            statement.addBatch("insert into teacher values(514,'CNM','女')");
            statement.addBatch("insert into teacher values(810,'DSB','女')");
            //统一处理
            statement.executeBatch();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
