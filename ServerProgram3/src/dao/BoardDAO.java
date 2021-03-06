package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import dto.BoardDTO;
import dto.ReplyDTO;

public class BoardDAO {

	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private String sql;
	
	private static DataSource dataSource;
	static {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static BoardDAO instance = new BoardDAO();
	private BoardDAO() {}
	public static BoardDAO getInstance() {
		if (instance == null) {
			instance = new BoardDAO();
		}
		return instance;
	}
	
	/* 1. 접속 해제 */
	public void close(Connection con, PreparedStatement ps, ResultSet rs) {
		try {
			if (con != null) { con.close(); }
			if (ps != null) { ps.close(); }
			if (rs != null) { rs.close(); }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/* 2. 게시글 삽입 */
	public int insertBoard(BoardDTO dto) {
		int result = 0;
		try {
			con = dataSource.getConnection();
			sql = "INSERT INTO BOARD VALUES (BOARD_SEQ.NEXTVAL, ?, ?, ?, 0, ?, SYSDATE)";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getAuthor());
			ps.setString(2, dto.getTitle());
			ps.setString(3, dto.getContent());
			ps.setString(4, dto.getIp());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, null);
		}
		return result;
	}
	
	/* 3. 전체 게시글 개수 구하기 */
	public int getTotalBoardCount() {
		int count = 0;
		try {
			con = dataSource.getConnection();
			sql = "SELECT COUNT(*) FROM BOARD";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				count = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, rs);
		}
		return count;
	}
	
	/* 4. 게시글 목록 반환 */
	public List<BoardDTO> selectList() {
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		try {
			con = dataSource.getConnection();
			sql = "SELECT B.NO, B.AUTHOR, B.TITLE, B.CONTENT, B.HIT, B.IP, B.POSTDATE" + 
				  "  FROM (SELECT ROWNUM AS RN, A.NO, A.AUTHOR, A.TITLE, A.CONTENT, A.HIT, A.IP, A.POSTDATE" + 
				  "          FROM (SELECT NO, AUTHOR, TITLE, CONTENT, HIT, IP, POSTDATE" + 
				  "                  FROM BOARD" + 
				  "                 ORDER BY NO ASC) A ) B";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setNo(rs.getInt(1));
				dto.setAuthor(rs.getString(2));
				dto.setTitle(rs.getString(3));
				dto.setContent(rs.getString(4));
				dto.setHit(rs.getInt(5));
				dto.setIp(rs.getString(6));
				dto.setPostdate(rs.getDate(7));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, rs);
		}
		return list;
	}
	
	/* 5. 게시글 반환 */
	public BoardDTO selectOneBoardByNo(int no) {
		BoardDTO dto = null;
		try {
			con = dataSource.getConnection();
			sql = "SELECT NO, AUTHOR, TITLE, CONTENT, HIT, IP, POSTDATE" +
				  "  FROM BOARD" +
				  " WHERE NO = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			rs = ps.executeQuery();
			if (rs.next()) {
				dto = new BoardDTO();
				dto.setNo(rs.getInt(1));
				dto.setAuthor(rs.getString(2));
				dto.setTitle(rs.getString(3));
				dto.setContent(rs.getString(4));
				dto.setHit(rs.getInt(5));
				dto.setIp(rs.getString(6));
				dto.setPostdate(rs.getDate(7));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, rs);
		}
		return dto;
	}
	
	/* 6. 조회수 증가 */
	public void updateHit(int no) {
		try {
			con = dataSource.getConnection();
			sql = "UPDATE BOARD SET HIT = HIT + 1 WHERE NO = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, null);
		}
	}
	
	
	
	
	
	/* 7. 게시글 삭제 */
	public int deleteBoard(int no) {
		int result = 0;
		try {
			con = dataSource.getConnection();
			sql = "DELETE FROM BOARD WHERE NO = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, null);
		}
		return result;
	}
	
	/* 8. 게시글 수정 */
	public int updateBoard(BoardDTO dto) {
		int result = 0;
		try {
			con = dataSource.getConnection();
			sql = "UPDATE BOARD SET TITLE = ?, CONTENT = ? WHERE NO = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getTitle());
			ps.setString(2, dto.getContent());
			ps.setInt(3, dto.getNo());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, null);
		}
		return result;
	}
	
	/* 9. 댓글 삽입 */
	public int insertReply(ReplyDTO dto) {
		int result = 0;
		try {
			con = dataSource.getConnection();
			sql = "INSERT INTO REPLY VALUES (REPLY_SEQ.NEXTVAL, ?, ?, ?, ?, SYSDATE)";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getAuthor());
			ps.setString(2, dto.getContent());
			ps.setString(3, dto.getIp());
			ps.setInt(4, dto.getBoardNo());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, null);
		}
		return result;
	}
	
	
	
	/* 10. 댓글 리스트 반환 */
	public List<ReplyDTO> selectListReply(int no) {
		List<ReplyDTO> replyList = new ArrayList<ReplyDTO>();
		try {
			con = dataSource.getConnection();
			sql = "SELECT NO, AUTHOR, CONTENT, IP, BOARD_NO, POSTDATE FROM REPLY WHERE BOARD_NO = ? ORDER BY POSTDATE";
			ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			rs = ps.executeQuery();
			while (rs.next()) {
				ReplyDTO dto = new ReplyDTO();
				dto.setNo(rs.getInt(1));
				dto.setAuthor(rs.getString(2));
				dto.setContent(rs.getString(3));
				dto.setIp(rs.getString(4));
				dto.setBoardNo(rs.getInt(5));
				dto.setPostdate(rs.getDate(6));
				replyList.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, rs);
		}
		return replyList;
	}
	
	/* 11. 댓글 삭제 */
	public int deleteReply(long replyIdx) {
		int result = 0;
		try {
			con = dataSource.getConnection();
			sql = "DELETE FROM REPLY WHERE NO = ?";
			ps = con.prepareStatement(sql);
			ps.setLong(1, replyIdx);
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, rs);
		}
		return result;
	}
	
	/* 조회수 가장 많은 사람 찾기 */
	public BoardDTO topHitPerson() {
		BoardDTO dto = null;
		try {
			con = dataSource.getConnection();
			sql = "SELECT HIT FROM BOARD WHERE HIT = (SELECT MAX(HIT) FROM BOARD)";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				dto = new BoardDTO();
				dto.setHit(rs.getInt(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, rs);
		}
		return dto;
	}

}