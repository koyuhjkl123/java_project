package ch17;

public class Company {
	
	private static Company instance = new Company();
	
	private Company() {
		
	}
	
	public static Company getInstance() { // 이게 싱글톤 패턴
		
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}

}
