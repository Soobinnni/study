
import java.sql.*;

public class SQLBookInsertTest {
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
	
	private static void addBook(String title, String publisher, String year, int price) throws SQLException{
		Connection con = a();
		
		try {
			Statement st = (Statement) con.createStatement();
			//s에 들어오는 title..들은 (인수를 받아온)매개변수
			String s = "INSERT INTO BOOKS (book_id, title, publisher, year, price) VALUES";
			s+="(" + "book_id_seq.nextval,"+ "'"+title+"',"+" '"+publisher+"', '"+year+"', "+price+")";
			System.out.println(s);
			int i = st.executeUpdate(s);
			if(i==1) {
				System.out.println("레코드 추가 성공");
			} else {
				System.out.println("레코드 추가 실패");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
	public static void main(String[] args) throws SQLException {
		addBook("Artificial Intellegence", "Addison Wesley", "2002", 35000);
	}

}
