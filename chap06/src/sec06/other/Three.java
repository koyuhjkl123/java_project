package sec06.other;

import sec06.One;


// final 클래스의 예
class Good {
	
	public int more;

	public int getMore(int s) {
		return more;
	}

	public void setMore(int more) {
		this.more = more;
	}
	
	
	
}
class Better extends Good{
	
	@Override
	public int getMore(int l) {
		
		super.more = l;
		return super.getMore(more);
	}
	
	
}
final class Best extends Better {}
//class NumberOne extends Best{} 
// Best 클래스는 final 로 지정되어 있어서 더 이상 자식 클래스 확장이 불가


public class Three extends One{
	
//	void print() {
//		One o = new One();
//		One1 o1 = new One1();
//		
////		System.out.println(o.secret);
////		System.out.println(o.roommate);
////		System.out.println(o.); // protected
//		System.out.println(o.anybody); // 다른 패키지라면 public 만 멤버에 접근이 가능함
//	}
	
	public static void main(String[] args) {
		Better o = new Better();
		
		System.out.println(o.getMore(50));
		
		
		
		
	}

}
