package sec06.other;


class One{
	private int secret = 1;
	int roommate =2; // 디폴트 접근 제어자
	protected int child = 3;
	public int anybody = 4;
}


class One1 extends One{
	
	void print() {
		System.out.println(roommate); // 
		System.out.println(child); //
		System.out.println(anybody); //
	}
}

public class Test {
	
	



}
