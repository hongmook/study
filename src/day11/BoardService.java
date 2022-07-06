package day11;

public interface BoardService {

	//게시물 등록
	void insertBoard(Board board);
	
	//게시물 리스트 출력
//	Board[] listBoard();
	
	Board[] listBoard(String category, String keyword);
	
	//게시물 수정
	Board modifyBoard(Board board);
	
	//게시물 삭제
	void deleteBoard(String seqno);


	//타이틀 검색
//	Board[] serchTitle(String category, String keyword);

	default void printboard(Board[] board2) {
		
		for(int i=0; i<board2.length; i++) {
			System.out.print(board2[i].getSeqno() + "\t");
			System.out.print(board2[i].getTitle() + "\t");
			System.out.print(board2[i].getContent() + "\t\n");
		}
		
	}

	Board[] listBoard();
	
	
	
	
	
	
	
	
	
}
