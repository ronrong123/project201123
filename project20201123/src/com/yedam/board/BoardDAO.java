package com.yedam.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class BoardDAO {
	Connection conn = null;
	PreparedStatement pstmt;
	ResultSet rs; //select 할 때만 필요하다. 결과를 담을때
	String sql;

	// 리스트
	public List getBoardList() {
		conn = DAO.getConnection();//DB에 연결
		sql = "select * from board order by 1";
		List list = new ArrayList();

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				/*
				 * next의 의미 : 읽어올때 데이터의 처음부터 읽어오므로 next를 만나면 한 로우를 읽어오고 다음로우로 내려간다. next하면 한줄한줄
				 * 내려가면서 데이터를 가져오게 하는 역할 끝까지 가서 next를 만나면 반복이 끝난다.
				 */
				BoardVO vo = new BoardVO();
				vo.setBoardNo(rs.getInt("board_no"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWriter(rs.getString("writer"));
				vo.setCreationDate(rs.getString("creation_date"));
//				가져올 컬럼의 데이터 타입에 따라서 결정, 괄호 안에는 컬럼 이름을 적어준다. EMPLYOEE_ID에 해당하는 데이터를 가져온다.				
				list.add(vo); //만들어둔리스트에넣음
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	// 조회
	public BoardVO getbd(int bdNo) {
		sql = "select * from board where board_no = ?";
		conn = DAO.getConnection();
		BoardVO vo = new BoardVO();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bdNo);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				vo.setBoardNo(rs.getInt("board_no"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWriter(rs.getString("writer"));
				vo.setCreationDate(rs.getString("creation_date"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return vo;
	}

	// 등록
	public void inserBd(BoardVO vo) {
		sql ="INSERT INTO board(board_no, title, CONTENT, writer, creation_date)"
				+ "VALUES(?,?,?,?,sysdate)";
		conn = DAO.getConnection();
		try {
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getBoardNo());
			pstmt.setString(2, vo.getTitle());
			pstmt.setString(3, vo.getContent());
			pstmt.setString(4, vo.getWriter());
//			pstmt.setString(5, vo.getCreationDate());
			
			int r = pstmt.executeUpdate();
			
			if (r == 1) {
				System.out.println("업데이트되었습니다.");
			}else {
				System.out.println("실패하였습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteBd(int bdNo) {
		sql = "DELETE FROM board WHERE board_no = ?";
		conn = DAO.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bdNo);
			rs = pstmt.executeQuery();
			System.out.println("삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void updateBd(BoardVO vo) {
		sql = "update board set title=?, content=?, writer=?, creation_date=sysdate where board_no=?";
		conn = DAO.getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setString(3, vo.getWriter());
			pstmt.setInt(4, vo.getBoardNo());
			
			int r = pstmt.executeUpdate();
			System.out.println(r +"건 수정됨.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			/*
			 * 다쓰면 연결을 해제해야한다. 해제를 안시키면 다른 사용자가 쓸수 없으므로. 닫을때 finally를 사용하여 닫는다. 열렸는지 체크하면서
			 * 닫아줘야한다. 값이변경됬는지 보고 열린지 판단 / resultset부터 반대로 확인 > statement > connection 순으로
			 */

			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		}
}
