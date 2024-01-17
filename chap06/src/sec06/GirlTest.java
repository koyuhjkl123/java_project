package sec06;

public class GirlTest {

	public static void main(String[] args) {
		
	Girl[] girls = { new Girl("갑순이"),new GoodGirl("콩쥐"),
			new BestGirl("황진이")};
	
	for(Girl g: girls) {
		g.show();
	}
	
	
		
//		g2.show(); //오버라이딩이 되지 않아 출력 할수가 없음
//		gg.show();

	}
	// BestGirl > GoodGirl > Girl

}
