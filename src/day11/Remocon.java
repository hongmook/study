package day11;

public interface Remocon extends RemoteControl, Searcher {

	@Override
	default void search(String url) {
		System.out.println("리모콘 인터페이스 검색기 입니다.");
		
	}

	//<default 메소드가있는 인터페이스 상속 받는 경우>
	//default 메소드를 추상메소드로 재선언이 가능
	//default 메소드를 재정의해서 실행내용 변경 가능
	
	//기능을 확장하기 위해서 다른인터페이스를 상속하여 기능을 사용하기 위해
	
	void setMute(boolean mute); //추상메소드 재선언
	
	
}
