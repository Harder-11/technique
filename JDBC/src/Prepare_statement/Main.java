package Prepare_statement;

import java.sql.*;
import java.util.Scanner;

/*
为了防止SQL注入攻击,我们使用PreparedStatement进行预处理
 */
public class Main {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/study","root","123456")){
            //使用预处理
            PreparedStatement statement = connection.prepareStatement("select * from user where username = ? and pwd = ?");
            Scanner sc = new Scanner(System.in);
            //然后以替换的方式把问号换成输入的两个参数
            //我们是假设要输入两个参数,看数据库里面是否有这个人,而且密码正确,那么就可以登录成功
            statement.setString(1,sc.nextLine());
            statement.setString(2,sc.nextLine());
            //这里进行查询操作就是直接按照我们给的参数查询的,返回结果自然也是给的参数查询结果
            ResultSet set = statement.executeQuery();
            while(set.next()){
                String username = set.getString(1);
                System.out.println(username + " 登陆成功!");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
