package home01;

public class VarEx2 {

	public static void main(String[] args) {
		//i의값과 y의 값을 바꾸기 위해서는 새로운 변수가 필요함
		
		int i =10, y=20;
		int tmp = 0;
		
		tmp = i;
		i = y;
		y = tmp;
		
		System.out.println("tmp : " +tmp);
		System.out.println("i : " +i);
		System.out.println("y : " +y);
	}

}
