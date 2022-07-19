package day13;

public class Box<T> {
	//T : type, K : key, V : value, N : number, E : element
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}

}
