package assignment_1_q_2_Encapsulation;

public class StudentEncapsulation {
	private String studentName;
	private int studentRollNo;
	private int studentAge;

	public int getAge() {
		return studentAge;
	}

	public String getName() {
		return studentName;
	}

	public int getRollNo() {
		return studentRollNo;
	}

	public void setAge(int age) {
		studentAge = age;
	}

	public void setName(String newName) {
		studentName = newName;
	}

	public void setRollNo(int rollNo) {
		studentRollNo = rollNo;
	}
}