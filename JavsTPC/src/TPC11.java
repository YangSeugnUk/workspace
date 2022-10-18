import kr.tpc.BookVO;

public class TPC11 {
	public static void main(String[] args) {
		// 책 1권을 저장하기위해 [객체를 생성] 하시오.
		BookVO b = new BookVO();
		b.title = "python";
		b.price = 16000;
		b.company = "aircon";
		System.out.print(b.title + "\t");
		System.out.print(b.price + "\t");
		System.out.print(b.company + "\t");
		System.out.println();

		BookVO b1 = new BookVO();
		b1.title = "java";
		b1.price = 12000;
		b1.company = "aircon";
		System.out.print(b1.title + "\t");
		System.out.print(b1.price + "\t");
		System.out.print(b1.company + "\t");
	
	}
}
