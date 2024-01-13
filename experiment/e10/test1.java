package experiment.e10;

import java.sql.Driver;
import java.sql.*;
import javax.sql.*;

/*
jdbc连接mysql
* */
public class test1 {
//    public static final String DBDRIVER = "com.mysql.jdbc.Driver";
    public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
//    public static final String DBURL = "jdbc:mysql://localhost:3306/company";
    public static final String DBURL = "jdbc:mysql://localhost:3306/company?useUnicode=true&characterEncoding=UTF-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";


    public static final String DBUSER = "demo";
    public static final String DBPASS = "password";

    public static void main(String[] args) {
        //TODO Auto-generated method stub
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName(DBDRIVER);
        } catch (ClassNotFoundException e1) {
            //TODO: handle exception
            e1.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
            statement = connection.createStatement();

// // 删除原表
//            statement.executeUpdate("DROP TABLE employeeInformation");

// 创建表
            statement.executeUpdate("CREATE TABLE employeeInformation(id CHAR(30), name CHAR(20), sex CHAR(2), age INTEGER, jobTitle CHAR(20), wage INTEGER, partyMember CHAR(20))");
//
// // 插入数据
            statement.executeUpdate("INSERT INTO employeeInformation VALUES(‘01’,‘张三’,‘男’, 18,‘高’, 25000,‘是’)");
            statement.executeUpdate("INSERT INTO employeeInformation VALUES(‘02’,‘李四’,‘女’, 20,‘高’, 20000,‘否’)");
            statement.executeUpdate("INSERT INTO employeeInformation VALUES(‘03’,‘小王’,‘男’, 20,‘中’, 15000,‘是’)");
            statement.executeUpdate("INSERT INTO employeeInformation VALUES(‘04’,‘AJ’,‘女’, 28,‘中’, 4396,‘否’)");
            statement.executeUpdate("INSERT INTO employeeInformation VALUES(‘005’,‘DJ’,‘女’, 61,‘低’, 9000,‘是’)");
// //
// // 删除年龄超过60岁的员工记录
// statement.executeUpdate("DELETE FROM employeeInformation WHERE age>60");
//
// // 修改职称为高级且为党员的员工的工资设为3000
// statement.executeUpdate("UPDATE employeeInformation SET wage=3000 WHERE jobTitle=‘高’&&partyMember=‘是’");
//
// 在表中查询所有记录显示到屏幕上
            PreparedStatement pstm = connection.prepareStatement("select * from company");
            ResultSet rs = pstm.executeQuery();
            System.out.println("编号" + "\t姓名" + "\t性别" + "\t年龄" + "\t职称" + "\t工资" + "\t是否党员");
            while (rs.next()) {
                String id = rs.getString("id").trim();
                String name = rs.getString("name").trim();
                String sex = rs.getString("sex").trim();
                int age = rs.getInt("age");
                String jobTitle = rs.getString("jobTitle").trim();
                int wage = rs.getInt("wage");
                String partyMember = rs.getString("partyMember").trim();
                System.out.println(id + "\t" + name + "\t" + sex + "\t" + age + "\t" + jobTitle + "\t" + wage + "\t" + partyMember)
                ;
            }
        } catch (Exception e) {
// TODO: handle exception
            e.printStackTrace();
        }
        try {
            statement.close();
            connection.close();
        } catch (SQLException e) {
// TODO: handle exception
            e.printStackTrace();
        }
    }

}

