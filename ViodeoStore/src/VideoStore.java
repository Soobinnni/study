import java.io.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class VideoStore {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int menuNumber;

		while (true) {
			menu(); // 메뉴호출
			System.out.print("번호 입력 : ");
			menuNumber = input.nextInt();
			
			switch (menuNumber) {
			case 1: //고객 등록
				gogekRegister();				
				break;
			case 2: //2.고객 검색
				gogekSearch();
				break;
			case 3: //3. 비디오 등록
				videoRegister();
				break;
			case 4: //4. 비디오 목록
				//videoSearch();
				videoList();
				break;
			case 5: //5. 비디오 대여
				lendVideo();				
				break;
			case 6 : //6. 비디오 대여 목록
				lendReturnList();
			case 7 :
				System.out.println("\n미래 비디오 대여 시스템 종료 GoodBye!");
				return;
			default:
				System.out.println("해당 번호만 입력하세요");
				break;
			}
		}
	}

	public static void gogekRegister() { // 고객 등록 메서드
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		BufferedReader in_gogek = new BufferedReader(new InputStreamReader(System.in));

		// 연결시도
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("DB접속 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 에러 : " + e.toString());
			return;
		} catch (Exception e) {
			System.out.println("DB 접속 실패 : " + e.toString());
			return;
		}

		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "1234");
			System.out.println("DB 접속 성공!");

			// 변수 선언
			String name; // 고객 이름
			int age; // 고객 나이
			String addr; // 고객 주소
			String tel; // 고객 전화번호

			String sql = "";// sql문
			int insertCount; // INSERT 성공 여부

			System.out.println("\n=== 고객 등록 ===");
			System.out.print("고객 이름 입력 : ");
			name = in_gogek.readLine();
			System.out.print("고객 나이 입력 : ");
			age = Integer.parseInt(in_gogek.readLine()); // parseInt는 정적 메서드
			System.out.print("고객 주소 입력 : ");
			addr = in_gogek.readLine();
			System.out.print("고객 전화번호 입력 : ");
			tel = in_gogek.readLine();

			sql = "insert into v_gogek values (v_gogek_seq.nextval, ?, ?, ?, ?)";

			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, age);
			ps.setString(3, addr);
			ps.setString(4, tel);

			// 성공 여부
			insertCount = ps.executeUpdate();

			if (insertCount == 1) {
				// 고객 등록 성공시
				System.out.println("고객 등록 성공 : " + insertCount);
				sql = "select * from v_gogek";
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();

				System.out.println("일련번호\t이름\t나이\t주소\t\t전화번호");

				while (rs.next()) {
					System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t"
							+ rs.getString(4) + "\t\t\t" + rs.getString(5));
				}
			} else {
				// 고객 등록 실패시
				System.out.println("고객 등록 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	//고객 검색 메서드
	public static void gogekSearch() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sql ="";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("DB 접속 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 에러 : "+e.toString());
			return;
		} catch (Exception e) {
			System.out.println("DB 접속 실패 : "+e.toString());
		}
		
		try {
			//DB연결 시도
			con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "1234");
			
			String name; 
			
			//검색하기
			System.out.print("고객 정보를 이름으로 검색합니다. 이름 입력 : ");
			name = br.readLine();
			
			sql = "select * from v_gogek where g_name = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			rs = ps.executeQuery();
			
			System.out.println("일련번호\t이름\t나이\t주소\t\t전화번호");

			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t"
						+ rs.getString(4) + "\t\t\t" + rs.getString(5));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) {
					rs.close();
				}if(ps!=null) {
					ps.close();
				}if(con!=null) {
					con.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	//비디오 등록 메서드
	public static void videoRegister() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sql= "";
		int insertCount;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("DB 접속 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 에러 : "+e.toString());
			return;
		} catch (Exception e) {
			System.out.println("DB 접속 실패 : "+e.toString());
		}
		
		try {
			//DB연결 시도
			con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "1234");
			
			//v_code = video_seq
			String title; //비디오 제목
			String genre; //비디오 장르
			int pay; //지불 비용
			int landState; //대여 여부
			String makeCompany; //제작사
			String makeDate; //출시 날짜
			int viewAge; //시청 연령

			System.out.println("\n===비디오 등록===");
			System.out.print("비디오 제목 입력 : ");
			title = br.readLine();
			System.out.print("비디오 장르 입력 : ");
			genre = br.readLine();
			System.out.print("비디오 대여 비용 입력 : ");
			pay = Integer.parseInt(br.readLine());
			System.out.print("비디오 대여 여부 입력(1 : 대여O / 2 :  대여X) ");
			landState = Integer.parseInt(br.readLine());
			System.out.print("제작사 입력 : ");
			makeCompany = br.readLine();
			System.out.print("비디오 출시 일자 입력 : ");
			makeDate = br.readLine();
			System.out.print("비디오 시청 연령 입력 : ");
			viewAge = Integer.parseInt(br.readLine());
			
			sql = "insert into video values (video_seq.nextval, ?, ?, ?, ?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, genre);
			ps.setInt(3, pay);
			ps.setInt(4, landState);
			ps.setString(5, makeCompany);
			ps.setString(6, makeDate);
			ps.setInt(7, viewAge);
			insertCount = ps.executeUpdate();

			if (insertCount == 1) {
				System.out.println("비디오 등록 성공 : "+insertCount);
				sql = "select * from video";
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				System.out.println("\n비디오 리스트");
				System.out.println("일련번호\t제목\t장르\t지불 비용\t대여 여부\t제작사\t출시 연도\t\t관람등급");
				while (rs.next()) {
					System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
							+ rs.getInt(4) + "\t" + rs.getInt(5)+ "\t" +rs.getString(6)+ "\t" +
							rs.getString(7).substring(0,4)+ "\t" +rs.getInt(8));
				}
			} else {
				System.out.println("비디오 등록 실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) {
					rs.close();
				}if(ps!=null) {
					ps.close();
				}if(con!=null) {
					con.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	//비디오 목록
	public static void videoList() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sql ="";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("DB 접속 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 에러 : "+e.toString());
			return;
		} catch (Exception e) {
			System.out.println("DB 접속 실패 : "+e.toString());
		}
		
		try {
			//DB연결 시도
			con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "1234");
			
			//비디오 목록 부르기
			sql = "select v_code, v_title, v_genre, v_lend_state from video";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			System.out.println("일련번호\t제목\t장르\t대여 여부(1 = 대여가능)");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
						+ rs.getInt(4));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) {
					rs.close();
				}if(ps!=null) {
					ps.close();
				}if(con!=null) {
					con.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	//비디오 검색 메서드
	public static void videoSearch() {
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String sql ="";
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("DB 접속 성공!");
			} catch (ClassNotFoundException e) {
				System.out.println("드라이버 로딩 에러 : "+e.toString());
				return;
			} catch (Exception e) {
				System.out.println("DB 접속 실패 : "+e.toString());
			}
			
			try {
				//DB연결 시도
				con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "1234");
				
				String title; //비디오 제목
				System.out.println("==비디오 검색==");
				System.out.print("비디오 제목을 입력하세요 : ");
				title = br.readLine();
				
				sql = "select * from video where v_title = ?";
				
				ps = con.prepareStatement(sql);
				ps.setString(1, title);
				
				rs = ps.executeQuery();
				System.out.println("일련번호\t제목\t장르\t지불 비용\t대여 여부\t제작사\t출시 연도\t시청연령");
				while (rs.next()) {
					System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
							+ rs.getInt(4) + "\t" + rs.getInt(5)+ "\t" +rs.getString(6)+ "\t" +
							rs.getString(7).substring(0,4)+ "\t" +rs.getInt(8));
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if(rs!=null) {
						rs.close();
					}if(ps!=null) {
						ps.close();
					}if(con!=null) {
						con.close();
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
	}

	// 비디오 대여
	public static void lendVideo() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sql ="";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("DB 접속 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 에러 : "+e.toString());
			return;
		} catch (Exception e) {
			System.out.println("DB 접속 실패 : "+e.toString());
		}
		
		try {
			//DB연결 시도
			con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "1234");
			
			//변수
			String searchName; //고객 이름 검색
			String searchVideo;//비디오 검색
			int g_code;//고객 코드
			int v_code;//비디오 코드
			int v_pay;//대여 금액
			int insertCount;
			
			System.out.println("===고객 검색===");
			System.out.print("고객 이름 검색 : ");
			searchName = br.readLine();
			System.out.println("===비디오 검색===");
			System.out.print("비디오 제목 검색 : ");
			searchVideo = br.readLine();
			
			sql = "select g_code, v_code, v_pay from v_gogek, video where"
					+ " g_name = ? and v_title = ?";
			//실행문 보내기
			ps = con.prepareStatement(sql);
			ps.setString(1, searchName);
			ps.setString(2, searchVideo);
			//실행문 토대로 결과집합 부르기
			rs = ps.executeQuery();
			if (rs.next()) {
				g_code = rs.getInt("g_code");
				v_code = rs.getInt("v_code");
				v_pay = rs.getInt("v_pay");
				
				sql = "insert into lend_return values\n"
						+ "(lend_return_seq.nextval, ?, ?, sysdate, sysdate+3, ?)";
				ps = con.prepareStatement(sql);
				ps.setInt(1, g_code);
				ps.setInt(2, v_code);
				ps.setInt(3, v_pay);
				insertCount = ps.executeUpdate();
				
				if (insertCount == 1) {
					sql = "select l.lr_code, g.g_name, v.v_title, l.l_date, l.r_plan_date, l.l_total_pay\n"
							+ "from lend_return l, v_gogek g, video v\n"
							+ "where g.g_code = ? and v.v_code=?";
					ps = con.prepareStatement(sql);
					ps.setInt(1, g_code);
					ps.setInt(2, v_code);
					
					rs = ps.executeQuery();
					System.out.println("\n대여 정보");
					System.out.println("대여번호\t고객번호\t비디오번호\t대여일자\t\t\t반납예정일\t\t\t대여총액");
					if(rs.next()) {
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+
					rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getInt(6)+"원");
					}
				}
			} else {
				System.out.println("일치하는 고객 또는 비디오 항목이 없습니다.");
			}
			
			
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) {
					rs.close();
				}if(ps!=null) {
					ps.close();
				}if(con!=null) {
					con.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	// 비디오 대여 목록
	public static void lendReturnList() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sql ="";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("DB 접속 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 에러 : "+e.toString());
			return;
		} catch (Exception e) {
			System.out.println("DB 접속 실패 : "+e.toString());
		}
		
		try {
			//DB연결 시도
			con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "1234");
			
			sql = "select l.lr_code, g.g_name, v.v_title, l.l_date, l.r_plan_date, l.l_total_pay\n"
					+ "from lend_return l, v_gogek g, video v\n"
					+ "where g.g_code = l.g_code and v.v_code = l.v_code";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			System.out.println("\n대여 리스트");
			System.out.println("대여번호\t고객번호\t비디오번호\t대여일자\t\t\t반납예정일\t\t\t대여총액");
			while (rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"
						+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) {
					rs.close();
				}if(ps!=null) {
					ps.close();
				}if(con!=null) {
					con.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
			
	};
	
	
	// 메뉴 메서드
	public static void menu() {
		System.out.println("미래 비디오 대여 시스템");
		System.out.println("1. 고객등록");
		System.out.println("2. 고객 검색");
		System.out.println("3. 비디오 등록");
		System.out.println("4. 비디오 목록");
		System.out.println("5. 비디오 대여");
		System.out.println("6. 비디오 대여 목록");
		System.out.println("7. 종료");
	}
}
