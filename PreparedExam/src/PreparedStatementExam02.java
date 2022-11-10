import java.io.*;
import java.sql.*;

public class PreparedStatementExam02 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "1234";
		// 입력받는 버퍼

		// 드라이버 접속
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩에러 : " + e.toString());
		} catch (Exception e) {
			System.out.println("DB 접속 실패 : " + e.toString());
		}

		// DB 연결 및..
		try {
			con = DriverManager.getConnection(url, user, password);

			// sql문 작성
			String sql = "create table syh1011(id varchar2(10), password varchar2(10))";
			// PreparedStatement 객체 생성
			ps = con.prepareStatement(sql);
			int updateCount = ps.executeUpdate();
			System.out.println("CreateCount : " + updateCount);

			sql = "insert into syh1011 values(?, ?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, "syh20222");
			ps.setString(2, "1111");
			updateCount = ps.executeUpdate();
			System.out.println("inseartCount : " + updateCount);

			sql = "select id, password from syh1011";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("id : " + rs.getString(1));
				System.out.println("password : " + rs.getString(2));
			}

			sql = "drop table syh1011";
			ps = con.prepareStatement(sql);
			updateCount = ps.executeUpdate();
			System.out.println("dropCount : " + updateCount);
		} catch (SQLException e) {
			System.out.println("실패 ! " + e.getMessage());
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
