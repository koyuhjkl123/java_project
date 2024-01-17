package ch15;

public class TaxiTest {

	public static void main(String[] args) {
		
		Taxi taxi = new Taxi("잘 간다 운수");
		Student student = new Student("Edward", 20000);
		
		
		student.takeStudent(taxi);
		
		taxi.showTaxiInfo();
		student.showStudentInfo();
		
		byte lo = 5;
		Byte ls = 2;
	}

}
