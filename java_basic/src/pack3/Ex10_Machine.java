package pack3;

public class Ex10_Machine {
	class CoinIn {
	    // CoinIn 클래스의 변수들: 동전 입력 관련
	    private int coin;
	    private int jandon; // 잔돈 계산

	    // 동전을 넣을 때마다 금액을 갱신하는 메소드
	    public void calc(int insertedCoin) {
	        this.coin = insertedCoin;
	    }

	    // 동전과 잔돈 계산
	    public int getCoin() {
	        return coin;
	    }

	    public int calculateChange(int cupCount, int coffeePrice) {
	        int totalCost = coffeePrice * cupCount; // 커피 한 잔의 가격 * 원하는 잔 수
	        if (coin >= totalCost) {
	            jandon = coin - totalCost;
	        } else {
	            jandon = 0; // 잔돈이 부족하면 0
	        }
	        return jandon;
	    }
	}
}
