import kr.tpc.MemberVO;

public class TPC15 {
	public static void main(String[] args) {
		MemberVO m = new MemberVO("홍길동",40,"00","seoul");
		
		System.out.println(m.toString());
		
		MemberVO m1 = new MemberVO();
		m1.setName("leejin");
		m1.setAge(32);
		m1.setTel("010");
		m1.setAddr("Daejeon");
		
		System.out.println(m1);
	}

}
