package AccOther;

public class Access {
	
	private String a = "프라이빗데이터";
	public String b = "퍼블릭데이터";
	protected String c = "프로텍티드데이터";
	String d = "디폴트데이터";
	
	public void output() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
