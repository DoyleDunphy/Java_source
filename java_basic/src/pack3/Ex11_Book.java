package pack3;

class Ex11_Book {
	private String title;
	private String author;
	
	public Ex11_Book(String title, String author) {
		this.title=title;
		this.author=author;
	}
	
	public String getBookInfo() { 
		return title + " 저자는 " + author;
	}



}
