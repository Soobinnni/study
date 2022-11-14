package controller;

import java.sql.*;
import model.SubjectVO;

public class SubjectDAO {
	String sql = "";
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	SubjectVO sVo = null;

	// 학과 목록
	public void getSubjectTotalList() throws Exception {
		sql = "select * from subject order by no";

		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			System.out.println("일련번호\t학과번호\t학과명");
			while (rs.next()) {
				sVo = new SubjectVO();
				sVo.setNo(rs.getInt(1)); // sVo.setNo(rs.getInt("no"))
				sVo.setS_num(rs.getString(2)); // sVo.setS_num(rs.getString("s_num"))
				sVo.setS_name(rs.getString(3));// sVo.setS_name(rs.getString("s_name"))
				System.out.println(sVo.getNo() + "\t" + sVo.getS_num() + "\t" + sVo.getS_name());
			}

		} catch (SQLException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
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
			}
		}
	}

	// 학과 등록
	public void setSubjectRegiste(SubjectVO svo) throws Exception {
		sql = "insert into subject(no, s_num, s_name) values (subject_seq.nextval, ?, ?)";

		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, svo.getS_num());
			ps.setString(2, svo.getS_name());

			int i = ps.executeUpdate();
			if (i == 1) {
				System.out.println("학과 등록 성공!!\n" + svo.getS_name() + " 학과 등록 완료.");
			} else {
				System.out.println("학과 등록 실패!!");
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

	// 학과 수정
	public void setSubjectUpdate(SubjectVO svo) throws Exception {
		sql = "update subject set s_num = ?, s_name = ? where no = ?";
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, svo.getS_num());
			ps.setString(2, svo.getS_name());
			ps.setInt(3, svo.getNo());
			
			int i = ps.executeUpdate();
			
			if (i == 1) {
				System.out.println("학과 수정 성공!!\n" + svo.getS_name() + " 학과 수정 완료.");
			} else {
				System.out.println("학과 수정 실패!!");
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
	
	// 학과 삭제
	public void setSubjectDelete(SubjectVO svo) throws Exception {
		//sql문 작성
		sql = "delete from subject where no = ?"; //Stringbuffer sql = new Stringbuffer();
		//sql.append("delete from subject where no = ?");
		
		//연결 시도 및 sql 실행
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql); //ps = con.prepareStatement(sql.toString());
			ps.setInt(1, sVo.getNo());
			//성공 여부
			int i = ps.executeUpdate();
			if (i == 1) {
				System.out.println("학과 삭제 성공!!\n" + svo.getS_name() + " 학과 삭제 완료.");
			} else {
				System.out.println("학과 삭제 실패!!");
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
}
