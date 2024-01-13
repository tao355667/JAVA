package experiment.e10;

import java.sql.Driver;
import java.sql.*;
import javax.sql.*;

/*
jdbc����mysql
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

// // ɾ��ԭ��
//            statement.executeUpdate("DROP TABLE employeeInformation");

// ������
            statement.executeUpdate("CREATE TABLE employeeInformation(id CHAR(30), name CHAR(20), sex CHAR(2), age INTEGER, jobTitle CHAR(20), wage INTEGER, partyMember CHAR(20))");
//
// // ��������
            statement.executeUpdate("INSERT INTO employeeInformation VALUES(��01��,��������,���С�, 18,���ߡ�, 25000,���ǡ�)");
            statement.executeUpdate("INSERT INTO employeeInformation VALUES(��02��,�����ġ�,��Ů��, 20,���ߡ�, 20000,����)");
            statement.executeUpdate("INSERT INTO employeeInformation VALUES(��03��,��С����,���С�, 20,���С�, 15000,���ǡ�)");
            statement.executeUpdate("INSERT INTO employeeInformation VALUES(��04��,��AJ��,��Ů��, 28,���С�, 4396,����)");
            statement.executeUpdate("INSERT INTO employeeInformation VALUES(��005��,��DJ��,��Ů��, 61,���͡�, 9000,���ǡ�)");
// //
// // ɾ�����䳬��60���Ա����¼
// statement.executeUpdate("DELETE FROM employeeInformation WHERE age>60");
//
// // �޸�ְ��Ϊ�߼���Ϊ��Ա��Ա���Ĺ�����Ϊ3000
// statement.executeUpdate("UPDATE employeeInformation SET wage=3000 WHERE jobTitle=���ߡ�&&partyMember=���ǡ�");
//
// �ڱ��в�ѯ���м�¼��ʾ����Ļ��
            PreparedStatement pstm = connection.prepareStatement("select * from company");
            ResultSet rs = pstm.executeQuery();
            System.out.println("���" + "\t����" + "\t�Ա�" + "\t����" + "\tְ��" + "\t����" + "\t�Ƿ�Ա");
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

