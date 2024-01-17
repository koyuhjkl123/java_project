package ch15;

public class Student {
	
	String name;
	int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeStudent(Taxi taxi) {
		taxi.takeTaxi(10000);
		this.money -= 10000;
	}
	
	public void showStudentInfo() {
		System.out.println(name + "님의 남은 돈은 " + money+ "원 입니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
