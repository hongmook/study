package day06;

public class Board {
	//필드  //사칙연산이 필요하면 int 단순나열만 하면 string도 가능
	private int seqNo;
	private String title;
	private String content;
	private String name;
	private int cnt;
	private String open;
	private String wdat;
	
	//생성자
	Board(){
		super();
	}
	
	
	//메소드 public : 접근 제한자(p.194)-
	public int getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String isOpen() {
		return open;
	}
	public void setOpen(String open) {
		if(open == "ture")
		this.open = open;
	}
	public String getWdat() {
		return wdat;
	}
	public void setWdat(String wdat) {
		this.wdat = wdat;
	}
	

}