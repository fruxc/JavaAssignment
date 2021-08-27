package assignment_1_q_2_Encapsulation;

public class Student {

	public static void main(String[] args) {
		StudentEncapsulation studentEncapsulation = new StudentEncapsulation();
		studentEncapsulation.setName("Hammad");
		studentEncapsulation.setAge(23);
		studentEncapsulation.setRollNo(2);
		// Displaying values of the variables
		System.out.println("Student's Name: " + studentEncapsulation.getName());
		System.out.println("Student's Age: " + studentEncapsulation.getAge());
		System.out.println("Student's Roll No: " + studentEncapsulation.getRollNo());

	}
}