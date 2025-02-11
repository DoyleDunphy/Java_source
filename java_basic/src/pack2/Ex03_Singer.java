package pack2;

public class Ex03_Singer {
	private String name="무명가수"; // 멤버필드
	private String titleSong="아 대한민국"; // "
	
	public Ex03_Singer(String name,String title) {
		//생성자
		this.name=name;
		titleSong=title;
	}
	
	public void sing() {
		//String name="아이유"; // 지역변수
		// System.out.println(this.name+"의 노래 제목은 "+ titleSong); //무명가수
		System.out.println(name+"의 노래 제목은 "+ titleSong); //아이유
	}
	
	public void setTitleSong(String titleSong) { //setter
		this.titleSong=titleSong;
	}

	public static void main(String[] args) {
		Ex03_Singer bts= new Ex03_Singer("BTS","Dynamite");
		bts.sing();
		bts.setTitleSong("BTS 만세");
		bts.sing();
		bts.setTitleSong("BTS 화이팅");
		bts.sing();
		
	System.out.println();
	
		Ex03_Singer blackpink=new Ex03_Singer("블랙핑크","how you like that");
		blackpink.sing();
		
		
	}

}
