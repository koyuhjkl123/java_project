package sec06;

public class GoodGirl extends Girl{ // googirl 자식 클래스

	
	public GoodGirl(String name) {
		super(name);
	}
	void show() {
		System.out.println(name+"그녀는 자바를 잘 안다.");
	}
}
