package day05;

public class ArrayEx3 {

	public static void main(String[] args) {

		int[][][] arr = new int[2][3][2];
		
		int num= 1;
		int sum= 0;
		for(int i=0; i< arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				for(int k=0; k< arr[i][j].length; k++) {
					arr[i][j][k] = num++;
					System.out.println("arr["+i+"]["+j+"]["+k+"] =" + arr[i][j][k]);
					sum += arr[i][j][k]; //sum += num을 했을경우 위에서 num++이 있기때문에 시작이 0이 아니라 1부터 시작 
				}
			}
		} 
		System.out.println(sum);

	}

}