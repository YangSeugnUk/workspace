import kr.tpc.MemberVO;

public class TPC14 {
	public static void main(String[] args) {
		MemberVO m = new MemberVO();
//		m.name="hong";
//		m.age=50;
//		m.tel="000";
//		m.addr="서울";
//		
//		System.out.println(m.name);
		m.setName("song");
		
		System.out.println(m.getName());
	}
}
