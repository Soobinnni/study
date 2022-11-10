import java.sql.*;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class SalaryIncrease {
	public static Connection createCon() {
		Connection con = null;

		String pack = "oracle.jdbc.driver.OracleDriver"; // 패키지 경로
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "1234";

		try {
			Class.forName(pack);
			System.out.println("드라이버 적재에 성공했습니다.");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("데이터베이스 연결에 성공했습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 적재에 실패했습니다.");
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결에 실패했습니다.");
		}
		return con;
	}

	public static void main(String[] args) throws SQLException {
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		Connection con = createCon();
		Statement st = con.createStatement();

		int employee_id;

		String name;
		int salary;
		double total_salary;

		String input_job_id;
		String job_id;

		double increasePC;
		
		System.out.println("인상 급여 계산 프로그램");
		System.out.println("*** 업무명 ***");
		ResultSet rs1 = st.executeQuery("select distinct job_id from employees");
		
		int count = 0;
		while(rs1.next()) {
			job_id = rs1.getString("job_id");
			if(count<4) {			
				System.out.print(job_id+" ");
				count++;
			} else {
				count=0;
				System.out.println();
			}
		}
		
		System.out.println("\n\n인상할 업무명 입력 : ");
		input_job_id = input1.next();
		System.out.println("급여 인상 퍼센트(예 : 21.4) : ");
		increasePC = input2.nextDouble();
		increasePC = (increasePC/100)+1;

		ResultSet rs = st.executeQuery("select job_id, employee_id, last_name || ' ' || first_name as name, salary, "
				+ increasePC + " * salary as total from employees where job_id = upper('" + input_job_id + "')"
				+ " order by employee_id");

		System.out.println("사원번호 이름 업무명 인상 전 급여 인상 후 급여");

		while (rs.next()) {
			// 사원번호
			employee_id = rs.getInt("employee_id");
			// 이름
			name = rs.getString("name");

			// 업무명
			job_id = rs.getString("job_id");

			// 인상 전 급여
			salary = rs.getInt("salary");

			// 인상 후 급여
			total_salary = rs.getDouble("total");

			System.out.println(job_id + employee_id + name + salary + total_salary);
		}
	}

}
