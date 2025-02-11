package pack5;

import java.util.ArrayList;

//List : 이름과 같이 목록처럼 데이터를 순서에 따라 관리함 + 중복 허용
public class Ex34_CollectionList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("볼펜");
		list.add("연필");
		list.add("볼펜+");
		list.add("볼펜");
		list.add("마우스");
		System.out.println("list 크기: " + list.size());
		list.remove("볼펜"); // 값으로 삭제
		System.out.println("list 크기: " + list.size());
		list.remove(1); // 순서로 삭제
		System.out.println("list 크기: " + list.size());
		System.out.println("list의 0번째는 " + list.get(0));
		
		System.out.println();
		//출력방법1
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		//출력방법2
		System.out.println();
		for(String data:list) {
			System.out.println(data);
		}
		
	}

}
