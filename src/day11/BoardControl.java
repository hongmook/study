package day11;

public class BoardControl {

	public static void main(String[] args) {
		BoardServiceImpl boardImpl = new BoardServiceImpl();
		
		Board[] board = boardImpl.listBoard();
		
		for(int i=0; i<board.length; i++) {
			System.out.print(board[i].getSeqno() + "\t");
			System.out.print(board[i].getTitle() + "\t");
			System.out.print(board[i].getContent() + "\t\n");
		}
		
		System.out.println("--------------------------------------");
		
		//keyword
		String keyword = "비";
		
		Board[] rs = boardImpl.serchTitle(keyword);
		if(rs.length>0) {
			//게시물 리스트 출력
			for(int i=0; i<board.length; i++) {
				System.out.print(board[i].getSeqno() + "\t");
				System.out.print(board[i].getTitle() + "\t");
			}
			
			} else {
			System.out.println("게시물 제목에서 미발견");
		}
		
	}

}
