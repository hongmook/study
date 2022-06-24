package day03;

public class WhileEX {

	public static void main(String[] args) {
		
		//1차원 배열선언
		int[] num = new int[6];
		
		//로또 생성
		int i = 0;
		while(i < 6) {
			int lotto = (int)(Math.random()*45)+1;
			
			for(int j=0; j < i; j++) {
				if(num[j] == lotto) {
					lotto = (int)(Math.random()*45)+1;
					j=-1;
				} 
			}
			num[i] = lotto;
			i++;
			
		} 
		
		for(int j=0; j<6; j++) {
			System.out.print(num[j]);
			//if(j == 2) continue; - 값을 충족하면 밑에 있는 실행문을 무시하고 위로 올라감 ex)1,2,34,5,6
			//if(j == 2) break; - 값을 충족하면 멈춤 ex)1,2,3			
			if(j != 5)
				System.out.print(",");
		}
		
		System.out.println("-------");
		//do~while문
		/*
		 * do { 
		 * 	실행문; 
		 * } while(조건식);
		 */
		
		String[] menu = {"불백", "짬뽕", "서브웨이", "김밥"}; //글자들이 상수풀에 저장됨 // menu라는 스텍에 쌓임
		int[] cnt = {0,0,0,0};
		int no = 1;
		
		
		do {
			//0~3까지 범위에서 랜덤값 추출 0 ~ n-1
			int rd = (int)(Math.random()*menu.length);
			System.out.print(rd+",");
			cnt[rd] ++;
		} while (no++ < 10);
		
		System.out.println();
		//최다로 선택된 메뉴 출력 ==> 최대값 구하기
		
		int maxIdx = 0;
		for (int j=0; j < cnt.length; j++) {
			System.out.println("cnt[" + j + "] = " + cnt[j]);
			if(cnt[j] > cnt[maxIdx]) {
				maxIdx = j;
			}
		}
		System.out.println("최다 선택 메뉴는 =");
		//동등순위 출력
		for (int j=0; j < cnt.length; j++) {
			if(cnt[j] == cnt[maxIdx]) {
				System.out.print(menu[j]);
				System.out.println(",");
			}
		}

	}

}