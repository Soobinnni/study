import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class ProcedureTest {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws SQLException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Connection con = null; 
		CallableStatement cstmt = null;
		int deptno;
		double rate;
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "1234");
			cstmt = con.prepareCall("{call proc01(?, ?)}"); // 실행할 프로시저 명시. 매개변수만큼 ? 바인딩변수 입력
			
			System.out.print("인상 부서번호 입력 : ");
			deptno = Integer.parseInt(br.readLine());
			System.out.print("\n인상률 입력 : ");
			rate = Double.parseDouble(br.readLine());
			
			cstmt.setInt(1, deptno);
			cstmt.setDouble(2, rate);
			cstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("Connection Error");
			e.printStackTrace();
		} catch (IOException e) {
		} finally {
			try {
				if (cstmt != null) {
					cstmt.close();
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
