package day02;

public class Casting {

	public static void main(String[] args) {
		
		
		int num1 = 256;
		byte num2 = (byte)num1; 
		
		System.out.println(num2);
		
		Var_scope var = new Var_scope(); //new 생성자 호출
		var.grade = 'Z';
		System.out.println(var.grade);
	}

}
