import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {

	public static void main(String[] args) {
		// 관계를 이해하라. PDT vs UDDT
		// 기본자료형 (PDT) , 사용자정의자료형(UDDT)
		// 정수 1개를 저장하기위한 변수를 선언하시오.
		
		int a;
		a=10;
		
		// 책 1권을 저장하기 위한 변수를 선언하시오.
		// 책에는 제목, 가격, 출판사, 페이지수, ISBN 등 여러가지가 있고 설정해야한다.
		// 기억공간을 분리해서 저장시켜야 한다. 개별적으로 처리할순없고 묶어서 하나의 형태로 Book을 만들어야 한다.
		// 설계를 해줘야하는데 그걸 class라고 한다.
		// kr.bit 패키지에다 Book이라는 변수(클레스)를 만들어줘야 한다. (사용자정의 자료형)
		// V(Variable) : 변수, 메서드
		// D(DataType) : PDT, UDDT, array, class
		// A(Assign)   : 대입, 할당
		
		Book b;
		// b는 변수인데 변수는 데이터 1개만 저장을 할 수 있는거다. 그럼 Book에는 제목, 가격... 이런것들을 넣으려면? 객체를 생성!
		b = new Book(); // 객체를 생성하다.
		b.title="자바";
		b.price=15000;
		b.company="한빛미디어";
		b.page=700;
		
		System.out.println(b.title);
		System.out.println(b.price);
		
		PersonVO p;
		p = new PersonVO();
		p.name = "박메일";
		p.age = 40;
		p.weight = 68.4f;
		p.height = 175.7f;
		
		System.out.print(p.name + "\t");
		System.out.print(p.age + "\t");
		System.out.print(p.height + "\t");
		
		
	}

}