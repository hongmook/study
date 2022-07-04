package day11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import day10.Oracleconn;

public class BoardDao {
	
	private final static Connection conn = Oracleconn.getInstance().getConn(); 
	
		Board[] getList(){
			
		String sql = "SELECT rownum, seqno, title, wdate, count, name, content";
			   sql += " FROM ("; 
			   sql += " SELECT seqno,rownum,title,content,"; 	   
			   sql += " TO_CHAR(b.wdate, 'yyyy\"년\"mm\"월\"dd\"일\" HH:MI:SS PM', 'nls_date_language=american') wdate,";
			   sql += " count,name";
			   sql += " FROM board b, member m";
			   sql += " WHERE b.id = m.id and b.title like '%?%' ";
			   sql += " ORDER BY wdate DESC)";
			   sql += " WHERE rownum BETWEEN 1 AND 100";
			   
			   
		PreparedStatement stmt = null;
		Board[] board = null;
		
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,
										      ResultSet.CONCUR_UPDATABLE);
			stmt.setString(1, "%keyword%");
			ResultSet rs = stmt.executeQuery();
			
			
			
			
			
			//레코드 개수 구하기
			rs.last();
			board = new Board[rs.getRow()];

			//커서를 헤더로 이동
			rs.beforeFirst();
			
			
			int i = 0;
			while(rs.next()) {
				Board b = new Board();
				b.setSeqno(rs.getString("seqno"));
				b.setTitle(rs.getString("title"));
				b.setContent(rs.getString("content"));
				
				board[i++] = b;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return board;
	}
		
	
	
}
