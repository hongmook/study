package day11;

public class BoardServiceImpl implements BoardService {

	
	private final BoardDao boardDao =new BoardDao();
	   
	   @Override
	   public void insertBoard(Board board) {
	   }
	   
	   @Override
	   public Board[] listBoard() {
	      //BoardDao boardDao =new BoardDao(); 위에서 필드로 선언을 해버림
	      Board[] board = boardDao.getLists(null,null);
	      return board;
	   }
	   
	   @Override //메서드 오버라이딩
	   public Board[] listBoard(String categoty,String keyword) {
	      //BoardDao boardDao =new BoardDao(); 위에서 필드로 선언을 해버림
	      Board[] board = boardDao.getLists(categoty,keyword);
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
		public void printboard(Board[] board2) {
			// TODO Auto-generated method stub
			BoardService.super.printboard(board2);
		}
	}
