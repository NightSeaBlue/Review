package basic.temp.test;

import java.awt.*;

public class Test1 {
	
	Frame f;	
	
	Test1 () {
		f = new Frame ("나의 첫 창");		// Frame (String Title) / 창의 이름 지정
	}
	
	void addLayout() {
		f.setBounds(100,100,300,260);		// 사각형 생성
		f.setVisible(true);					// true 일 경우 출력
	}

	public static void main(String[] args) {		// Start
		
		Test1 t1 = new Test1();
		t1.addLayout();

	}

}
