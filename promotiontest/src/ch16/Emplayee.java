package ch16;


public class Emplayee {
	
	private static int serialNum = 1000;
	
	private int emploteeId;
	private String emoployeeName;
	private String department;
	protected int more;
	
	public Emplayee() { // defalut 생성자
		
		serialNum++;
		emploteeId = serialNum;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
	
	public int getEmployeeId() {
		return emploteeId;
	}
	public void setEmploteeId(int emploteeId) {
		this.emploteeId = emploteeId;
	}

	
	public String getEmoployeeName() {
		return emoployeeName;
	}

	public void setEmoployeeName(String emoployeeName) {
		this.emoployeeName = emoployeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	


}
