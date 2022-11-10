import java.sql.*;

public class DBdata {

	public static void main(String[] args) {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "1234";

		// 드라이버 로딩 시도
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 에러 : " + e.toString());
			return;
		} catch (Exception e) {
			System.out.println("DB 접속 실패 : " + e.toString());
		}
		// DB연결 시도
		Statement st = null;
		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB연결 성공");
			st = con.createStatement();
			String sql = "insert into test01_tb values(2, 'id02', '강감찬', 30)";
			System.out.println("SQL : " + sql);
			int result = st.executeUpdate(sql); // 갱신문 수행
			System.out.println(result + "개의 DATA 입력 성공!!");
		} catch (SQLException e) {
			System.out.println("Data입력 실패!!" + e.toString());
		} finally {
			try {
				if (st != null) {
					st.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		System.out.println("DB 접속 및 SQL 문 수행 성공!");

	}

}
