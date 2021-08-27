package assignment_1_q_1_Abstract_Interface;

public class EmployeeImplements extends EmployeeAbstract {

	@Override
	public void startHour() {
		System.out.println("Starts at 09:00");
	}

	@Override
	public void endHour() {
		System.out.println("Ends at 18:00");
	}

	public static void main(String[] args) {
		EmployeeAbstract employeeAbstract = new EmployeeImplements();
		int salary = 1000;
		employeeAbstract.salary(salary);
		employeeAbstract.startHour();
		employeeAbstract.endHour();
	}
}
