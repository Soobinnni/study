import java.io.*;
import java.sql.*;

public class PreparedStatementExam01 {

	public static void main(String[] args) throws SQLException, IOException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "1234";
		// 입력받는 버퍼
		BufferedReader in_empno = new BufferedReader(new InputStreamReader(System.in));

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
			String empno; // 사원번호
			System.out.print("검색하는 사원번호를 입력하세요 : ");
			empno = in_empno.readLine();

			// sql문 작성
			String sql = "select first_name, job_id, salary from employees where employee_id = ?";
			// PreparedStatement 객체 생성
			ps = con.prepareStatement(sql);
			ps.setString(1, empno);
			rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(
						"ename : " + rs.getString(1) + " job : " + rs.getString(2) + " sal : " + rs.getString(3));
			}
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
