package solid_principles.principle.open_closed.after;

public class Salary {

	public void calculateSalary(ISalary employee) {
		employee.calculateSalary();
	}
}
