package controller;

import java.sql.*;

import model.StudentVO;
import model.TraineeVO;

public class TraineeDAO {
	String sql = "";
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	//수강신청 목록 정보 보여주기--자기것만 볼 수 있게
	public void getTraineeTotalList(String sd_num) {
			TraineeVO tvo = new TraineeVO();
			sql = "select t.no as no, t.sd_num as sd_num, t.l_abbre as l_abbre, l.l_name as l_name, s.sd_name as sd_name, t_section, t_date "
					+ "from trainee t, student s, lesson l "
					+ "where t.sd_num=s.sd_num and t.l_abbre = l.l_abbre and t.sd_num = ? "
					+ "order by t_date";
			
			try {
				con = DBUtil.getConnection();
				ps = con.prepareStatement(sql);
				ps.setString(1, sd_num);
				rs = ps.executeQuery();
				
				System.out.println("일련번호\t학생번호\t\t과목약어\t과목명\t학생이름\t과목구분\t등록일");
				while(rs.next()) {
					tvo = new TraineeVO();
					tvo.setNo(rs.getInt("no"));
					tvo.setSd_num(rs.getString("sd_num"));
					tvo.setL_abbre(rs.getString("l_abbre"));
					tvo.setT_section(rs.getString("t_section"));
					tvo.setT_date(rs.getString("t_date"));
					
					System.out.println(tvo.getNo()+"\t"+tvo.getSd_num()+"\t"+tvo.getL_abbre()
					+"\t"+rs.getString("l_name")+"\t"+rs.getString("sd_name")+"\t"+tvo.getT_section()+"\t"+tvo.getT_date());
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
	// 수강신청
	//수강신청하기
	public void TraineeRegister(TraineeVO tvo) throws Exception {
		//no, sd_num, l_abbre, t_section, t_date
		sql = "insert into trainee values(trainee_seq.nextval, ?, ?, ?, sysdate)";
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, tvo.getSd_num());
			ps.setString(2, tvo.getL_abbre());
			ps.setString(3, tvo.getT_section());
			
			int i = ps.executeUpdate();
			
			if (i == 1) {
				System.out.println("수강신청 성공!!\n");
			} else {
				System.out.println("수강신청 실패!!");
			}
		} catch (SQLException e) {
			System.out.println("e = [" + e + "]");
		} catch (Exception e) {
			System.out.println("e = [" + e + "]");
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}				
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
	}
	//수강신청 삭제
	//수강신청 취소하기
	public void TraineeDelete(int no) throws Exception {	
		sql = "delete from trainee where no = ?";
		
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			
			int i = ps.executeUpdate();
			
			if (i == 1) {
				System.out.println("수강취소 성공!!\n");
			} else {
				System.out.println("수강취소 실패!!");
			}
		} catch (SQLException e) {
			System.out.println("e = [" + e + "]");
		} catch (Exception e) {
			System.out.println("e = [" + e + "]");
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}				
			} catch (SQLException e2) {
			}
		}
	}
}
