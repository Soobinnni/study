import java.sql.*;

public class DepartmentDB {

	public static Connection a() {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "1234";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 완료");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("접속 완료");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 적재 실패");
		} catch (SQLException e) {
			System.out.println("오라클 접속 실패");
		}
		return con;
	}
	public static void main(String[] args) throws SQLException {
		Connection con = a();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from employees");
		
		int ei;
		
		while(rs.next()) {
			ei=rs.getInt("employee_id");
			System.out.println(ei);
		}
	}
}
