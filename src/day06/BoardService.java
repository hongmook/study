package day06;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import day05.Member;

public class BoardService {
	
	//필드
	Member memeber; 
	
	
	public static void main(String[] args) {
		
		BoardService bs = new BoardService();
		//bs.memeber;

		
		
		DB db = new DB();
		Connection conn = db.mysqlConn();
		
		DB db2 = new DB();
		DB.mysqlConn();
		
		
//		System.out.format("%x%n", System.identityHashCode(db));
//		System.out.format("%x%n", System.identityHashCode(db2));
		
		//DB연결
		Board[] board = null;
		
		
		
		try {
			
			String sql = "Select * from board";
			PreparedStatement stmt = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,
															   ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery(sql);

			//Board[] board = new Board[10];
			
			//레코드 개수 구하기
			rs.last(); //커서를 마지막 레코드로 이동
			int rows = rs.getRow(); //rs.getRow 현재 행의 번호

			
			//rs.first(); - 첫번째 레코드 위치로 커서 이동
			rs.beforeFirst(); //필드헤더로 커서 이동
			System.out.println(rs.getRow());
			
			
			board = new Board[rows];
			
			for(int i=0; i<board.length; i++) {
				rs.next();
				
				board[i] = new Board();
				
				board[i].setSeqNo(rs.getInt("idx"));
				board[i].setTitle(rs.getString("title"));
				board[i].setContent(rs.getString("content"));
				board[i].setName(rs.getString("id"));
				board[i].setCnt(rs.getInt("cnt"));
				board[i].setOpen(rs.getString("open"));
				board[i].setWdat(rs.getString("wdate"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		/*
		for(int i=0; i < board.length; i++) {
			System.out.print(board[i].getSeqNo()+"\t");
			System.out.print(board[i].getTitle()+"\t");
			System.out.print(board[i].getContent()+"\t");
			System.out.print(board[i].getName()+"\t");
			System.out.print(board[i].getCnt()+"\t");
			System.out.print(board[i].isOpen()+"\t");
			System.out.print(board[i].getWdat()+"\t\n");
		}
		*/
		
		
		for(Board i : board) {
			System.out.print(i.getSeqNo()+"\t");
			System.out.print(i.getTitle()+"\t");
			System.out.print(i.getContent()+"\t");
			System.out.print(i.getName()+"\t");
			System.out.print(i.getCnt()+"\t");
			System.out.print(i.isOpen()+"\t");
			System.out.print(i.getWdat()+"\t\n");
		}
		
		
		
		
		
	}


}