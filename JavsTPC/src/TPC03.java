import kr.bit.Book;

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
	}

}