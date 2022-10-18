package kr.tpc;
// 책(Object) -> 제목, 가격, 출판사, 페이지수.....
public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;
	
	// 디폴트생성자메서드(생략)
	// 만약에 중복정의를하게되면 디폴트생성자는 저절로 만들어지지 않는다.
	// 그래서 명시적으로 만들어줘야한다.
	public BookVO() {
		//초기화 작업
		this.title="java";
		this.price=14000;
		this.company="easy";
		this.page=700;
	}
	//생성자 메서드의 중복정의(overloading)
	public BookVO(String title, int price, String company, int page) {
		this.title=title;
		this.price=price;
		this.company=company;
		this.page=page;
	}
}
