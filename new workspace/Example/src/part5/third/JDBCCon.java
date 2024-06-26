package part5.third;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCCon {
    public static Connection makeConnection() {

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String id = "marro";
        String password = "marro1234";
        Connection con = null;

        try {
            // 벤더가 제공한 JDBC 드라이버.
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("적재 성공");
            con = DriverManager.getConnection(url, id, password);
            System.out.println("연결 성공");
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버를 찾을 수 없습니다.");
        } catch (SQLException e) {
            System.out.println("연결에 실패했습니다.");
        }
        return con;
    }

    public static void main(String[] args) {
        Connection con = makeConnection();
    }
}
