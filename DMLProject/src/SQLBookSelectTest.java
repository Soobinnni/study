import java.sql.*;

public class SQLBookSelectTest {
	
	static Connection a() {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "1234";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 적재에 성공했습니다.");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("오라클 접속에 성공했습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 적재에 실패했습니다.");
		} catch(SQLException e) {
			System.out.println("연결에 실패했습니다.");
		}	
		return con;
	}
	
	
	public static void main(String[] args) throws SQLException {
		Connection con = a();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from books");
		
		int id;
		String title;
		
		while(rs.next()) {
			id = rs.getInt("book_id");
			title = rs.getString("title");
			
			System.out.println("책 일련번호 : "+id+" 책 제목 : "+title);
		}
	}

}
