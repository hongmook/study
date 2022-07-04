package day11;

public interface BoardService {

	//게시물 등록
	void insertBoard(Board board);
	
	//게시물 리스트 출력
	Board[] listBoard();
	
	//게시물 수정
	Board modifyBoard(Board board);
	
	//게시물 삭제
	void deleteBoard(String seqno);
	
	//게시물 조회

	Board[] serchTitle(String keyword);
	
	
	
	
	
	
	
	
}
