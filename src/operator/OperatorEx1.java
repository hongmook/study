package operator;

public class OperatorEx1 {

	public static void main(String[] args) {
		int i = 5;
		i++; //i = i+1과 같은 의미. ++i로 바꿔써도 결과는 똑같다
		
		System.out.println(i);
		i = 5;
		++i;
		System.out.println(i);

		i=5;
		int j=0;
		
		j = i++;
		
		System.out.println(i + "" + j);
		
		i=5;
		j=0;

		j = ++i;
		System.out.println(i + "" + j);
		
		i = -10;
		i = +i;
		System.out.println(i);
		
		i = -i;
		System.out.println(i);
	}

}
