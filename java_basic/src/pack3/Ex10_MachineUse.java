package pack3;

import java.util.Scanner;

public class Ex10_MachineUse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 커피 가격 상수
        final int COFFEE_PRICE = 200;
        
        // 동전 입력 받기
        System.out.print("동전을 입력하세요 : ");
        int insertedCoin = scanner.nextInt();
        
        // 커피 잔 수 입력 받기
        System.out.print("몇 잔을 원하세요 : ");
        int cupCount = scanner.nextInt();
        
        // 가격 계산
        int totalCost = COFFEE_PRICE * cupCount;
        int change = insertedCoin - totalCost;

        // 요금 부족 시 처리
        if (insertedCoin < totalCost) {
            System.out.println("요금이 부족합니다.");
        } else {
            System.out.println("커피 " + cupCount + "잔과 잔돈 " + change + "원");
        }

        scanner.close();
    }
}