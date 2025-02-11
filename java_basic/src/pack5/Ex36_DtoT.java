package pack5;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex36_DtoT {
	private ArrayList<Ex36_StudDto> list = new ArrayList<>();
	private String irum;
	private int kor, eng, add;

	public void insertData() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("이름:");
			irum = sc.next();
			System.out.print("국어:");
			kor = sc.nextInt();
			System.out.print("영어:");
			eng = sc.nextInt();
			
			Ex36_StudDto dto = new Ex36_StudDto();
			dto.setIrum(irum);
			dto.setKor(kor);
			dto.setEng(eng);
			list.add(dto);   // 각 학생 정보 컬렉션에 저장
			
			System.out.print("계속할까요?(y/n)");
			String b = sc.next();
			if(!b.equals("y")) break;
		}
	}
	
	public void showData() {
		int count = 0;  // 인원수 출력용
		
		for(int i=0; i < list.size(); i++) {
			Ex36_StudDto dto = list.get(i);
			int tot = dto.getKor() + dto.getEng();
			System.out.println(dto.getIrum() + " " + 
					dto.getKor() + " " + 
					dto.getEng() + " " + tot);
			
			count += 1;
		}
		System.out.println("응시 인원:" + count);
		System.out.println("응시 인원:" + list.size());
	}
	
	public static void main(String[] args) {
		Ex36_DtoT test2 = new Ex36_DtoT();
		test2.insertData();
		test2.showData();
	}
}
