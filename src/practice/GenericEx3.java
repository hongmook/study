package practice;

public class GenericEx3 {

	public static void main(String[] args) {
		Generic2<String, Integer> gen1 = new Generic2<String, Integer>();
		gen1.set("홍길동", 1111);
		//gen1.set("이순신", "A111"); 에러발생
	}

}

class Generic2<K,V>{
	K name;
	V id;
	
	void set(K name, V id) {
		this.name = name;
		this.id = id;
	}
	
	K getName() {
		return name;
	}
	
	V getId() {
		return id;
	}
}
