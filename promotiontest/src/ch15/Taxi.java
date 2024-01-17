package ch15;

public class Taxi{
	
	int money;
	String companyName;
	
	
	public void takeTaxi(int money) {
		this.money += money;
		
	}
	
	public Taxi(String companyName) {
		this.companyName = companyName;
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	public void showTaxiInfo() {
		System.out.println("잘 간다 운수택시 수입은 " + money+"원 입니다.");
	}

}
