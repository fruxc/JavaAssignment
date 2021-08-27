package assignment_1_q_1_Abstract_Interface;

public abstract class EmployeeAbstract implements EmployeeInterface {

	public void salary(int salary) {
		System.out.println("The Employee makese $" + salary + " per month");
	}
}
