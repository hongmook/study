package day05;

public class CalculatorEx {

	public static void main(String[] args) {
		
		Calculator c = new Calculator(20, 10);
		Calculator c2 = new Calculator(30, 10);
		
		Calculator c3 = new Calculator();
		
		
		int[] num = {1,2,3,4,5};
		int ch = c3.add(num);
		
		int[][] arr = {{1,2,3},{4,5,6}};
		int ck = c3.add(arr);
		
		System.out.println("-------------");
		System.out.println(c.add());
		System.out.println(c.sub());
		System.out.println(c.mul());
		System.out.println(c.div());
		System.out.println("-------------");
		System.out.println(c2.add());
		System.out.println(c2.sub());
		System.out.println(c2.mul());
		System.out.println(c2.div());
		System.out.println("-------------");
		
		System.out.println(ck);
		
		
	}

}
