import kr.tpc.BookDTO;

public class TPC10 {
	public static void main(String[] args) {
		//int, float, char, boolean -> PDT
		int a;
		a=10;
		// 책(BookDTO)이라는 자료형을 만ㄷ르자. --> class
		BookDTO b = new BookDTO();
		b.title="java";
		
		System.out.println(b.title);
		
	}
}
 