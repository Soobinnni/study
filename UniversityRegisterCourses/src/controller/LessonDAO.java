package controller;

import java.sql.*;

import model.LessonVO;
import model.SubjectVO;

public class LessonDAO {
	String sql = "";
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	LessonVO lvo = new LessonVO();

	// 과목 목록
	public void getLessonTotalList() throws Exception {
		sql = "select * from lesson order by no";
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			System.out.println("일련번호\t과목약어\t과목명");
			while (rs.next()) {
				LessonVO ls = new LessonVO();
				ls.setNo(rs.getInt(1));
				ls.setL_abbre(rs.getString(2));
				ls.setL_name(rs.getString(3));
				System.out.println(ls.getNo()+"\t"+ls.getL_abbre()+"\t"+ls.getL_name());
			}
		} catch (SQLException e) {
			System.out.println("e = [" + e + "]");
		} catch (Exception e) {
			System.out.println("e = [" + e + "]");
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
			} catch (SQLException e2) {
			}
		}
	}

	// 과목 등록
	public void setLessonRegiste(LessonVO lvo) throws Exception {
		sql = "insert into lesson values(lesson_seq.nextval, ?, ?)";
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, lvo.getL_abbre());
			ps.setString(2, lvo.getL_name());
			
			int i = ps.executeUpdate();
			if (i==1) {
				System.out.println("과목 등록 성공!!\n"+lvo.getL_name()+" 과목 등록 완료.");
			} else {
				System.out.println("과목 등록 실패!!");
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

	// 과목 수정
	public void setLessonUpdate(LessonVO lvo) throws Exception {
		sql = "update lesson set l_abbre = ? , l_name = ? where no = ?";
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, lvo.getL_abbre());
			ps.setString(2, lvo.getL_name());
			ps.setInt(3, lvo.getNo());
			
			int i = ps.executeUpdate();
			
			if (i==1) {
				System.out.println("과목 수정 성공!!\n"+lvo.getL_name()+" 과목 수정 완료.");
			} else {
				System.out.println("과목 등록 실패!!");
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

	// 과목 삭제
	public void setLessonDelete(LessonVO lvo) throws Exception {
		sql = "delete from lesson where no = ?";
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, lvo.getNo());
			int i = ps.executeUpdate();
			if (i==1) {
				System.out.println("과목 삭제 성공!!\n"+lvo.getL_name()+" 과목 삭제 완료.");
			} else {
				System.out.println("과목 삭제 실패!!");
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
