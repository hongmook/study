package day11;

public class BoardServiceImpl implements BoardService {

	
	
	@Override
	public void insertBoard(Board board) {
			
	}

	@Override
	public Board[] listBoard() {
		Board[] board = new BoardDao().getList();
		
		return board;
	}

	@Override
	public Board modifyBoard(Board board) {
		
		return null;
	}

	@Override
	public void deleteBoard(String seqno) {
		
		
	}

	@Override
	public Board[] serchTitle(String keyword) {
		BoardDao key = new BoardDao();
		Board[] board = key.serchTitle(keyword);
		
		return board;
	}
	


}
