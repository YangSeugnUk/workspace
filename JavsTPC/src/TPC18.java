import com.google.gson.Gson;

import kr.tpc.BookVO;
import kr.tpc.MyUtil;

public class TPC18 {
	public static void main(String[] args) {
		// 1. Java에서 제공해주는 class들... API
		// 문자열(String)
		String str = new String("APPLE");
		System.out.println(str.toLowerCase());
		
		// 2. 직접 만들어서 사용하는 class들... DTO/VO, DAO, Utility ... API
		// Utility
		MyUtil my = new MyUtil();
		int sum = my.hap();
		System.out.println(sum);
		
		// 3. 다른 회사에서 만들어놓은 class들... API
		// Gson -> json : https://mvnrepository.com/ 
		Gson g = new Gson();
		BookVO vo = new BookVO("java", 13000, "youngjin", 800);
		String json = g.toJson(vo);
		//{"title":"java","price":13000,"company":"youngjin","page":800} //Json구조
		System.out.println(json);
	}
}
