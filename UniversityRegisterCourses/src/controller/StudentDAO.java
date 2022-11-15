package controller;
import java.sql.*;
import model.*;


public class StudentDAO {
	String sql = "";
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	StudentVO stvo = null;
	//학생 전체 목록
	public void getStudentTotalList() throws Exception{
		sql = "select st.no as no, sd_num, sd_name, sd_id, sd_passwd, su.s_name as s_num, sd_birthday,"
				+ "sd_phone, sd_address, sd_email, sd_date "
				+ "from STUDENT st, SUBJECT su where st.s_num = su.s_num order by no";
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			System.out.println("일련번호\t학생번호\t\t성명\t아이디\t\t비밀번호\t\t학과\t\t생년월일\t\t전화번호\t\t주소\t\t\t이메일\t\t\t등록일자");
			while (rs.next()) {
				stvo = new StudentVO();
				stvo.setNo(rs.getInt(1));
				stvo.setSd_num(rs.getString(2));
				stvo.setSd_name(rs.getString(3));
				stvo.setSd_id(rs.getString(4));
				stvo.setSd_passwd(rs.getString(5));
				stvo.setS_num(rs.getString(6));
				stvo.setSd_birthday(rs.getString(7));
				stvo.setSd_phone(rs.getString(8));
				stvo.setSd_address(rs.getString(9));
				stvo.setSd_email(rs.getString(10));
				stvo.setSd_date(rs.getString(11));
				
				System.out.println(stvo.getNo()+"\t"+stvo.getSd_num()+"\t"+stvo.getSd_name()+"\t"+stvo.getSd_id()
				+"\t"+stvo.getSd_passwd()+"\t"+stvo.getS_num()+"\t\t"+stvo.getSd_birthday()+"\t"+stvo.getSd_phone()
				+"\t"+stvo.getSd_address()+"\t\t"+stvo.getSd_email()+"\t\t"+stvo.getSd_date());
			}
		} catch (SQLException e) {
			System.out.println("e = [" + e + "]");
		} catch (Exception e) {
			System.out.println("e = [" + e + "]");
		} finally {
			try {
				if (rs!=null) {
					rs.close();
				}
				if (ps!=null) {
					ps.close();
				}
				if (con!=null) {
					con.close();
				}				
			} catch (SQLException e2) {
			}
		}
	}
	//학생등록
	public void setStudentRegiste(StudentVO stvo) throws Exception{
		sql = "insert into student values (student_seq.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, sysdate)";
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, stvo.getSd_num());
			ps.setString(2, stvo.getSd_name());
			ps.setString(3, stvo.getSd_id());
			ps.setString(4, stvo.getSd_passwd());
			ps.setString(5, stvo.getS_num());
			ps.setString(6, stvo.getSd_birthday());
			ps.setString(7, stvo.getSd_phone());
			ps.setString(8, stvo.getSd_address());
			ps.setString(9, stvo.getSd_email());		
			
			int i = ps.executeUpdate();
			
			if (i == 1) {
				System.out.println("학생 등록 성공!!\n" + stvo.getSd_name() + " 학생 등록 완료.");
			} else {
				System.out.println("학생 등록 실패!!");
			}
		} catch (SQLException e) {
			System.out.println("e = [" + e + "]");
		} catch (Exception e) {
			System.out.println("e = [" + e + "]");
		} finally {
			try {
				if (ps!=null) {
					ps.close();
				}
				if (con!=null) {
					con.close();
				}				
			} catch (SQLException e2) {
			}
		}
		

	}
	
	//학생 정보 수정
	public void setStudentUpdate(StudentVO stvo) throws Exception{
		sql = "update student set sd_passwd = ?, sd_phone = ?, sd_address=?, sd_email = ?"
				+ "where sd_num=?";
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, stvo.getSd_passwd());
			ps.setString(2, stvo.getSd_phone());
			ps.setString(3, stvo.getSd_address());
			ps.setString(4, stvo.getSd_email());
			ps.setString(5, stvo.getSd_num());
			
			int i = ps.executeUpdate();
			
			if (i == 1) {
				System.out.println("학생정보 수정 성공!!\n" + stvo.getSd_name() + " 학생정보 수정 완료.");
			} else {
				System.out.println("학생정보 수정 실패!!");
			}
		} catch (SQLException e) {
			System.out.println("e = [" + e + "]");
		} catch (Exception e) {
			System.out.println("e = [" + e + "]");
		} finally {
			try {
				if (ps!=null) {
					ps.close();
				}
				if (con!=null) {
					con.close();
				}				
			} catch (SQLException e2) {
			}
		}
	}
	
	//학생 로그인(수정 시 필요)
	public boolean setStudentLogin(String id, String pw) throws Exception{
		sql = "select * from student where sd_id = ? and sd_passwd = ?";
		boolean loginSuccess = false;
		
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			rs = ps.executeQuery();
			//그룹함수이므로 값은 하나만..
			if (rs.next()) {
				loginSuccess = true; //로그인 성공
			}
		} catch (SQLException e) {
			System.out.println("e = [" + e + "]");
		} catch (Exception e) {
			System.out.println("e = [" + e + "]");
		} finally {
			try {
				if (rs!=null) {
					rs.close();
				}
				if (ps!=null) {
					ps.close();
				}
				if (con!=null) {
					con.close();
				}				
			} catch (SQLException e2) {
			}
		}
		return loginSuccess;
	}
	
	//학생 번호 가져오기
	public String getStudentNum(String id, String pw) throws Exception{
		sql = "select sd_num from student where sd_id = ? and sd_passwd=?";
		String sd_num=""; //반환할 학생번호
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			rs = ps.executeQuery();
			//그룹함수이므로 값은 하나만..
			if (rs.next()) {
				sd_num = rs.getString(1);
			}
		} catch (SQLException e) {
			System.out.println("e = [" + e + "]");
		} catch (Exception e) {
			System.out.println("e = [" + e + "]");
		} finally {
			try {
				if (rs!=null) {
					rs.close();
				}
				if (ps!=null) {
					ps.close();
				}
				if (con!=null) {
					con.close();
				}				
			} catch (SQLException e2) {
			}
		}
		return sd_num;
	}
	//동일 학과 학생 일련번호
	public String getStudentCount(String subjectNum) throws Exception{
		sql = "select LPAD(count(*)+1 , 4,'0') as studentCount from student where s_num = ?";
		String serialNum = ""; //반환할 값
		
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, subjectNum);
			rs = ps.executeQuery();
			//그룹함수이므로 값은 하나만..
			if (rs.next()) {
				serialNum = rs.getString(1);
			}
		} catch (SQLException e) {
			System.out.println("e = [" + e + "]");
		} catch (Exception e) {
			System.out.println("e = [" + e + "]");
		} finally {
			try {
				if (ps!=null) {
					ps.close();
				}
				if (con!=null) {
					con.close();
				}				
			} catch (SQLException e2) {
			}
		}
		
		return serialNum;
	}
	//학생 아이디 중복 체크
	public boolean getStudentIdOverlap(String overlap) {
		sql = "select * from student where sd_id = ?";
		boolean idOverlapResult = false;
		
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, overlap);
			rs = ps.executeQuery();
			if(rs.next()) {
				idOverlapResult = true; //중복된 아이디가 있다.
			}
		} catch (SQLException e) {
			System.out.println("e = [" + e + "]");
		} catch (Exception e) {
			System.out.println("e = [" + e + "]");
		} finally {
			try {
				if (rs!=null) {
					rs.close();
				}
				if (ps!=null) {
					ps.close();
				}
				if (con!=null) {
					con.close();
				}	
			} catch (Exception e2) {				
			}
		}
		return idOverlapResult;
	}
	
	//학생 정보
	public void getStudent(String id, String pw) throws Exception{
		sql = "select * from student where sd_id = ? and sd_passwd=?";
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			rs = ps.executeQuery();
			System.out.println("일련번호"+"\t"+"학생번호"+"\t\t"+"성명"+"\t아이디"+"\t\t"+"비밀번호"+"\t\t"+"학과"+"\t\t"
					+ "생년월일\t\t전화번호\t\t주소\t\t\t이메일\t\t\t등록일자");
			if(rs.next()) {
				stvo = new StudentVO();
				stvo.setNo(rs.getInt("no"));
				stvo.setSd_num(rs.getString("sd_num"));
				stvo.setSd_name(rs.getString("sd_name"));
				stvo.setSd_id(rs.getString("sd_id"));
				stvo.setSd_passwd(rs.getString("sd_passwd"));
				stvo.setS_num(rs.getString("s_num"));
				stvo.setSd_birthday(rs.getString("sd_birthday"));
				stvo.setSd_phone(rs.getString("sd_phone"));
				stvo.setSd_address(rs.getString("sd_address"));
				stvo.setSd_email(rs.getString("sd_email"));
				stvo.setSd_date(rs.getString("sd_date"));	
				
				System.out.println(stvo.getNo()+"\t"+stvo.getSd_num()+"\t"+stvo.getSd_name()+"\t"+
						stvo.getSd_id()+"\t"+stvo.getSd_passwd()+"\t"+stvo.getS_num()+"\t\t"+
						stvo.getSd_birthday()+"\t"+stvo.getSd_phone()+"\t"+stvo.getSd_address()
						+"\t\t"+stvo.getSd_email()+"\t\t"+stvo.getSd_date());
			}
		} catch (SQLException e) {
			System.out.println("e = [" + e + "]");
		} catch (Exception e) {
			System.out.println("e = [" + e + "]");
		} finally {
			try {
				if (rs!=null) {
					rs.close();
				}
				if (ps!=null) {
					ps.close();
				}
				if (con!=null) {
					con.close();
				}	
			} catch (Exception e2) {				
			}
		}
	}

}
