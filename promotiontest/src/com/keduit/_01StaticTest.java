package com.keduit;

public class _01StaticTest {
	
	// 학생의 학점을 구해보자
	// 학생 : 전공 점수, 교양 점수, 일반 점수 : 과목별
	// 선생님 : 해당되는 학생의 점수 / 학생(이름, 학번) / 학점계산
	
	
	private static final String STUDENT_ID = ""; // 학생 학번 고유값
	
	
	private String UserName; // 학생이름
	private String UserPhone; // 학생 번호
	
	private String UserSubject; // 학생 과목
	
	private int UserMajor; // 학생 전공
	private int UserCulture; // 학생 교양
	private int UserNomall; // 학생 일반
	
	private int UserSum; // 학생 총 학점
	
	public static String getStudentId() {
		return STUDENT_ID;
	}
	
	public String getUserName() {
		return UserName;
	}
	
	public void setUserName(String UserName) {
		this.UserName = UserName;
		// 데이터를 외부에서 막고(priavate) 메소드는 공개(public)해서 
		// 외부에서 메소드를 통해 데이터를 접근하는 방법을 유도한다.
		// 객체지향 프로그래밍에서는 메소드를 통해 데이터를 변경하는 방법을 선호
		// 이유 : 객체 데이터를 외부에서 읽고 변경하면 무결성이 깨지기 때문이다.
		// 예: 자동차 속도 음속 불가, 외부에서 음수로 설정하면 무결성이 깨진다.
	}
	
	public String getUserPhone() {
		return UserPhone;
	}
	
	public void setUserPhone(String UserPhone) {
		this.UserPhone = UserPhone;
		// 멤버변수와 매개변수 같은 변수명을 지정했을 경우 반드시 위와 같이
		// this.UserPhone = UserPhone; this로 활용해야 한
	}
	
	public String getUserSubject() {
		return UserSubject;
	}
	
	public void setUserSubject(String UserSubject) {
		this.UserSubject = UserSubject;
	}
	
	public int getUserMajor() {
		return UserMajor;
	}
	
	public void setUserMajor(int UserMajor) {
		this.UserMajor = UserMajor;
	}

	public int getUserCulture() {
		return UserCulture;
	}

	public void setUserCulture(int UserCulture) {
		this.UserCulture = UserCulture;
	}

	public int getUserNomall() {
		return UserNomall;
	}

	public void setUserNomall(int UserNomall) {
		this.UserNomall = UserNomall;
	}

	public int getUserSum() {
		return UserSum;
	}

	public void setUserSum(int UserSum) {
		this.UserSum = UserSum;
	}
	
	public void UserSubjectSum(int UserMajor, int UserCulture, int UserNomall) {
		this.UserMajor = UserMajor;
		this.UserCulture = UserCulture;
		this.UserNomall = UserNomall;
		int sum = (UserCulture + UserMajor + UserNomall) / 3;
		boolean sum_bool = sum >= 140;
		
		
		
	}
	
	
	
	
	

}
