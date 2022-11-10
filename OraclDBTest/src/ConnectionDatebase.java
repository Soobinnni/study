import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class ConnectionDatebase {

	public static Connection makeConnection() {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String password = "1234";
		Connection con = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("적재성공");
			con = DriverManager.getConnection(url, id, password);
			System.out.println("오라클 접속 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("연결에 실패했습니다.");
		}
		return con;
	}

	public static void main(String[] args) throws SQLException {
		Connection con = makeConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * \tfrom employees");

		int empNo;
		String eName;
		String job;
		String mgr;
		Date hireDate;
		int sal;
		double comm;
		String deptNo;

		System.out.println("사원번호\t사원명\t\t업무\t\t상관번호\t\t입사일\t\t급여\t\t커미션\t\t부호");

		while (rs.next()) {
			empNo = rs.getInt("employee_id");
			eName = rs.getString("first_name");
			job = rs.getString("job_id");
			mgr = rs.getString("manager_id");
			hireDate = rs.getDate("hire_date");
			sal = rs.getInt("salary");
			comm = rs.getDouble("commission_pct");
			deptNo = rs.getString("department_id");

			System.out.println(empNo + "\t" + eName + "\t\t" + job + "\t\t" + mgr + "\t\t" + hireDate + "\t" + sal + "\t\t\t"
					+ comm + "\t" + deptNo);
		}
	}
}
