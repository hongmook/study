package day11;

public class BoardControl {
	
	private void getsql(Board[] board2) {
		
		for(int i=0; i<board2.length; i++) {
			System.out.print(board2[i].getSeqno() + "\t");
			System.out.print(board2[i].getTitle() + "\t");
			System.out.print(board2[i].getContent() + "\t\n");
		}
		
	}

	public static void main(String[] args) {
		BoardServiceImpl boardImpl = new BoardServiceImpl();
		
		Board[] board = boardImpl.listBoard();
		
		new BoardControl().getsql(board);
		
System.out.println("--------------------------------------");
		
		//keyword
		String keyword = "토요일";
		
		Board[] rs = boardImpl.serchTitle(keyword);
		
		new BoardControl().getsql(rs);
		
	}

}
