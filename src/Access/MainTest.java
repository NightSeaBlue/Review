package Access;

import AccOther.Access;

public class MainTest extends Access {

	public static void main(String[] args) {
		
		MainTest acc = new MainTest ();
		//acc.a = "프라이빗 변경"; // -> private 변수는 외부 클래스에서 접근 불가.
		acc.b = "퍼블릭 변경";
		acc.c = "프로텍티드 변경"; // -> 외부 패키지에선 protected 변수 접근 불가. 상속 받은 경우 자식 클래스에서 접근 가능
		//acc.d = "디폴트 변경";	// -> 외부 패키지에선 default 변수 접근 불가.
		acc.output();

	}

}
