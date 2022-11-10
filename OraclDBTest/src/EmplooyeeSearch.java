import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmplooyeeSearch {

	public static Connection eS() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String password = "1234";
		Connection con = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 적재 성공");
			con = DriverManager.getConnection(url, id, password);
			System.out.println("데이터베이스 적재 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("연결에 실패했습니다.");

		}

		return con;
	}

	public static void main(String[] args) throws SQLException {
		Scanner searchName = new Scanner(System.in); //스캐너 생성
		
		Connection con = eS(); //connection객체 생성
		Statement stmt = con.createStatement(); //정적 SQL 문을 실행하고 생성된 결과를 반환하는 데 사용되는 개체입니다.
		
		//변수설정
		int eID; // 직원번호
		String eFN; // 직원 이름
		String eLN; // 직원 성
		int eSL; // 직원 월급
		
		System.out.println("검색할 이름을 입력합니다.");
		eFN = searchName.nextLine(); //사용자 검색할 이름 입력

		ResultSet rs = stmt.executeQuery(
				"select employee_id, first_name, last_name, salary\tfrom employees\twhere first_name='"+eFN+"'");
		
		System.out.println("직원번호\t이름\t성\t\t급여");
		while (rs.next()) {
			eID = rs.getInt("employee_id");
			eFN = rs.getString("first_name");
			eLN = rs.getString("last_name");
			eSL = rs.getInt("salary");
			
			System.out.println(+eID+"\t"+eFN+"\t"+eLN+"\t\t"+eSL);
		}
	}

}
