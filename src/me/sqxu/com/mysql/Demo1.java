package me.sqxu.com.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//使用JDBC技术实现查询数据库数据，并显示在控制台中
public class Demo1 {

    public static void main(String[] args) throws Exception {


        //注册驱动
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        //获取连接Connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day06", "root", "123");

        //得到执行sequel语句的对象Statement
        Statement stmt = conn.createStatement();
        //增加内容

        //String sql1 = "insert into users values(3,'zgs','1234321','zgs@sina.com','1980-12-05'),(5,'zgs','1234321','zgs@sina.com','1980-12-05')";
        //删除
        //String sql2 = "delete from users where id = 3";

        //修改数据
        //String sql3 = "UPDATE users SET password = '12987' WHERE id = 5";
        /*stmt.executeUpdate(sql3);*/

        //查找数据
        String sql4 = "select * from users";
        ResultSet rs = stmt.executeQuery(sql4);

        while(rs.next()){
            System.out.println(rs.getString(1) +
                    ", " + rs.getString(2) + ", "
                    + rs.getString(3));


        }


        rs.close();
        stmt.close();
        conn.close();



        //执行sql语句，并返回结果
       /* ResultSet rs = stmt.executeQuery("select password,email,birthday,id from users");

        //处理结果
        while(rs.next()){
            System.out.println(rs.getObject("password"));
            System.out.println(rs.getObject("id"));
            System.out.println(rs.getObject("birthday"));
            System.out.println(rs.getObject("email"));
            System.out.println("-----------------");
        }*/

        //关闭资源
        /*rs.close();*/
        stmt.close();
        conn.close();
    }
}
