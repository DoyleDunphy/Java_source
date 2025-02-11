package pack5;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex36_DtoTest2 {
	private ArrayList<Ex36_StudDto> list = new ArrayList<Ex36_StudDto>();
	
	public void insertData() {
		Scanner scanner = new Scanner(System.in);
		Ex36_StudDto studDto = null;
		
		while (true) {
			studDto = new Ex36_StudDto();
			
			System.out.println("이름을 입력하세요 ( 종료하려면 exit를 입력하세요 ) : ");
			String irum = scanner.nextLine();
			if (irum.equals("exit")) break;
			
			System.out.println("국어 점수 입력 : ");
			int kor = scanner.nextInt();
			
			System.out.println("영어 점수 입력 : ");
			int eng = scanner.nextInt();
			scanner.nextLine();
			
			studDto.setIrum(irum);
			studDto.setKor(kor);
			studDto.setEng(eng);
			
			list.add(studDto); // 각 학생 정보 컬렉션에 저장
			System.out.println("학생 정보가 저장되었습니다\n");
			}
		
		scanner.close();
		printStudents();
	}
		public void printStudents() {
			System.out.println("\n 저장된 학생 정보 ");
			for (Ex36_StudDto stud : list) {
				System.out.println(stud.getIrum()+ " "+
									stud.getKor()+ " "+
									stud.getEng() + " 총점 : "+ 
									(stud.getKor()+stud.getEng()));	
		}
			System.out.println("응시 인원 : " + list.size()); // list.size == count
	}
	public static void main(String[] args) {
		Ex36_DtoTest2 test2 = new Ex36_DtoTest2();
		test2.insertData();
		
			
		}
	}

