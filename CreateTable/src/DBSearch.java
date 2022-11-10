import java.sql.*;

public class DBSearch {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement st = null;
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
		System.out.println("\n\n일련번호\t아이디\t이름\t나이");
		try {
			st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from test01_tb");
			while (rs.next()) {
				String s = rs.getInt("num") + "\t";
				s += rs.getString("id") + "\t";
				s += rs.getString("name") + "\t";
				s += rs.getInt("age") + "\t";
				System.out.println(s);			
			}
			
		} catch (Exception e) {
			System.out.println("SELECT 실패! : "+e.toString());
		} finally {
			if(st!=null) {
				st.close();
			}
			if(con!=null) {
				con.close();
			}
		}
	}

}
