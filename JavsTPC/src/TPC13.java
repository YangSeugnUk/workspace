import kr.tpc.BookDTO;

public class TPC13 {
	public static void main(String[] args) {
		//책 -> class(BookDTO) -> 객체 -> 인스턴스
		String title = "spring";
		int price = 25000;
		String company = "jaypub";
		int page = 890;
		
		BookDTO dto; // dto(object:객체)
		dto = new BookDTO(title,price,company,page); /// dto(instance:인스턴스)
		bookPrint(dto);
	}
	
	public static void bookPrint(BookDTO dto) {
		System.out.println(dto.title);
	}
}
