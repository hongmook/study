package day13;

public class Util {
	//제네릭 메소드 정의 : 접근제한자 <타입파라미터> 리턴타입 메소드명(매개변수){ }
	//ex) public <T> Box<T> boxing(T, t){ }
	//타입 제한 : <T extends 최상위타입>
	
	static <T> Box<T> boxing(T t){
		Box<T> box = new Box();
		box.set(t);
		return box;
	}
	
	static <T extends Number> int compare(T t1, T t2) {
		double d1 = t1.doubleValue();
		double d2 = t2.doubleValue();
		
		return Double.compare(d1, d2);
	}
	
	static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2){
		boolean KeyCompare = p1.getKey().equals(p2.getKey());
		boolean ValueCompare = p1.getValue().equals(p2.getValue());
	
		return ValueCompare && KeyCompare;
	}
}
