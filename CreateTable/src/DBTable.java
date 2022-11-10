import java.sql.*;

public class DBTable {
	public static void main(String[] args) {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "1234";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 적재에 성공했습니다.");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("오라클 연결에 성공했습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 적재에 실패했습니다."+e.toString());
			return;
		} catch (SQLException e) {
			System.out.println("오라클 연결에 실패했습니다."+e.toString());
			return;
		}
		
		
		//sql문 작성
		String sql = "create table test01_tb("
				+"num number(6), id varchar2(10), name varchar2(20), age number(3)"
				+ ")";
		Statement st = null;
		
		try {
			st = con.createStatement(); // 질의 객체 생성
			st.executeUpdate(sql);//질의 수행
		} catch (SQLException e) {
			System.out.println("SQL문 수행 오류 : "+e.toString());
			return;
		} finally {
			try {
				st.close();//객체 반환
				con.close();//연결 끊기
			} catch (Exception e2) {
			}
		}
	}

}
