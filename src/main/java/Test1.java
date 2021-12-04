import com.ssm.bean.User;
import com.ssm.controller.UserController;
import org.springframework.stereotype.Controller;

import java.sql.*;
import java.util.List;

public class Test1 {
    public static void main(String[] args)  {
//        try {
//            // 加载mysql驱动
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            // 获得数据库连接
//            String url = "jdbc:mysql://localhost:3306/testday1?serverTimezone=Asia/Shanghai";
//            String root = "root";
//            String password = "123456gs";
//            Connection connection = DriverManager.getConnection(url,root,password);
//            String sql = "SELECT * FROM Student";
//            PreparedStatement statement = connection.prepareStatement(sql);
//            ResultSet res = statement.executeQuery();
//            while (res.next()){
//                System.out.println(res.getInt("id"));
//                System.out.println(res.getString("name"));
//            }
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
