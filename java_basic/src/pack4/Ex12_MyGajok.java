package pack4;

public class Ex12_MyGajok {
	public static void main(String[] args) {
		Ex12_GrandFa grandFa = new Ex12_GrandFa();
		System.out.println("가보: " + grandFa.gabo);
		System.out.println("가훈: " + grandFa.gahun);
		grandFa.say();
		System.out.println("할아버지 나이: "+ grandFa.getNai());

		System.out.println();
		Ex12_GrandFa grandFa2 = new Ex12_GrandFa(77);
		System.out.println("할아버지 나이: "+ grandFa2.getNai());
		
		System.out.println("----------------");
		Ex12_Father father = new Ex12_Father();
		System.out.println("가보: " + father.gabo);
		System.out.println("가훈: " + father.gahun);
		father.say();
		System.out.println("아버지 나이: "+ father.getNai());
		father.eat(); // 자식에게 동일한 멤버를 발견하지 못하면 부모 멤버를 호출
		System.out.println("집 : "+father.getHouse());
		father.showData();
		
		System.out.println("---------------------------");
		Ex12_Me me = new Ex12_Me();
		System.out.println("가보: " + me.gabo);
		System.out.println("가훈: " + me.gahun);
		me.say();
		System.out.println("내 나이: "+ me.getNai());
		me.eat(); // 자식에게 동일한 멤버를 발견하지 못하면 부모 멤버를 호출
		System.out.println("집 : "+me.getHouse());
		me.Biking();
	}

}
