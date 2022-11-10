import java.sql.*;

public class test {

	public static Connection a() {
		String pack= "oracle.jdbc.driver.OracleDriver";//패키지명
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "1234";
		
		Connection con=null;
		
		try {
			Class.forName(pack);
			System.out.println("드라이버 적재에 성공했습니다.");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("데이터베이스 접속에 성공했습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 적재에 실패했습니다.");
		} catch (SQLException e) {
			System.out.println("데이터베이스 접속에 실패했습니다.");
		}
		return con;
	}
	public static void main(String[] args)throws SQLException {
		Connection con = a();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select distinct job_id from employees");
		
		String job_id;
		
		while(rs.next()) {
			job_id = rs.getString("job_id");
			System.out.println(job_id);
		}

	}

}
