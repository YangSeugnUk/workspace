import kr.tpc.BookVO;

public class TPC12 {
	public static void main(String[] args) {
		// 생성자 -> 생성+초기화 -> 중복정의 가능
		 BookVO b1 = new BookVO();
		 System.out.println(b1.company);
		 
		 BookVO b2 = new BookVO();
		 System.out.println(b1.page);
		 
		 //생성자 메서드의 중복정의(overloading)
		 BookVO b3 = new BookVO("python", 18000, "daerim", 920);
		 System.out.println(b3.company);
	}
}
