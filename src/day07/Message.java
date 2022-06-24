package day07;

public class Message {

	private static Message instance;
	private String msg;

	private Message(String msg) {
		this.msg = msg;
	};
	
	static Message getInstance(String msg){
		if(instance == null) {
		instance = new Message(msg);
		}
		return instance;
	}

	String getMsg(){
		return msg;
	}
	
	
	
	
}