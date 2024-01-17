package ch17;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company company = Company.getInstance(); // static이기 때문에 객체
		
		System.out.println(company);
		// Company는 외부에서 사용할 수도 없고
		// 내부에 private으로 생성되어 있으며, 메소드만이 제공되기 때문에
		// 메소드만을 불러서 사용해야한다. < 싱글톤 패턴 >
		
		Calendar calendar = Calendar.getInstance();
		
		

	}

}
