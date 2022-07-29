package day14;

import java.util.*;

public class HashMapExam {

	public static void main(String[] args) {
		Map<String,Integer> map	= new HashMap<String,Integer>();
		
		map.put("반장", 100);
		map.put("홍묵", 90);
		map.put("세영", 95);
		
		System.out.println(map.put("세영", 100));
		System.out.println(map.put("세영", 85));
		System.out.println("크기 :" + map.size());
		
		//객체 찾기
		map.get("반장");
		System.out.println(map.get("반장"));
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet(); //key값 set얻기
		Iterator<String> keyIt = keySet.iterator();
		
		System.out.println(keyIt.hasNext()); //값이 있는지 확인
		
		while(keyIt.hasNext()) {
			String Key = keyIt.next();
			Integer value = map.get(Key);
			System.out.println("key : " + Key + ", Value : " + value);
		}

		
		//객체 삭제
		map.remove("반장");
		
		System.out.println("크기 : "+map.size());
	
		//entrySet() 메소드를 이용해서 모든 객체의 키와 값을 출력
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIt = entrySet.iterator();
		
		while(entryIt.hasNext()) {
			Map.Entry<String, Integer> entry = entryIt.next();
			String name = entry.getKey();
			Integer jumsu = entry.getValue();
			System.out.println("엔트리 키 : " + name + ", 값 : " + jumsu );
		}
	
	
	}

}
