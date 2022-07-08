package day12;

public class Excercise5 {
	
	//main에서 실행이 되면 맨 앞의 test1()이 실행되면서 test1()로 이동 후 test2()가 실행되어 test2()로 이동
	//test2()가 실행되면 nullpoint가 강제적으로 실행되면서 test1()에 있는 catch의 nullpointer로 이동
	//(2)가 가장먼저 출력되고 finally를 필수적으로 거쳐 (3)을 출력
	//다시 maind으로 돌아와 (4)을 출력하고 finally가 없으므로
	//최종출력값은 (2),(3),(4)
	
	public static void main(String[] args) {

		try {
			test1();
			System.out.println("(4)");
		} catch (Exception e) {
			System.out.println("(5)");
		}
	}
	
	public static void test1() {
		
		try {
			test2();
			System.out.println("(1)");
		} catch (NullPointerException e) {
			System.out.println("(2)");
		} finally {
			System.out.println("(3)");
		}
	}

	public static void test2() {
		throw new NullPointerException();
		
	}
	
}
